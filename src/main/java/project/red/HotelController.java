package project.red;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {
	private static final Logger log = LoggerFactory.getLogger(HotelController.class);

	@Autowired
	private HotelRepository repo;

	@GetMapping("/project/red/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		model.addAttribute("hotels", repo.findAll());
		return "/project/red/hotels";
	}

	@GetMapping("/project/red/insertHotel")
	public String create(@RequestParam String hotelName, @RequestParam String city, @RequestParam String roomCounter,

			Model model) {
		long rooms = 0;
		try {
			rooms = Long.parseLong(roomCounter);

		} catch (NumberFormatException nfe) {
			model.addAttribute("errorRooms", "***RoomCounter is missing!***");

			return "/project/red/insertHotel";
		}

		log.trace("get new hotel");

		if (hotelName.isEmpty()) {
			model.addAttribute("errorHotel", "***Hotel name is missing!***");

			return "/project/red/insertHotel";
		}
		if (city.isEmpty()) {
			model.addAttribute("errorCity", "***City is missing!***");

			return "/project/red/insertHotel";
		}
		try {
			Hotel hotel = new Hotel(hotelName, city, rooms);
			repo.save(hotel);
			model.addAttribute("hotels", repo.findAll());

			String hotelSaved = String.format("***New hotel inserted!***");
			model.addAttribute("hotelSaved", hotelSaved);
		} catch (Exception ex) {
			model.addAttribute("sameHotelCity", "***This Hotel already exists in this city!***");

			return "/project/red/insertHotel";
		}

		return "/project/red/hotels";
	}

	@GetMapping("/project/red/deleteHotel")
	public String delete(@RequestParam Long hotelId,

			Model model) {

		log.trace("get deleted hotel");
		model.addAttribute("hotels", repo.findAll());

		if (hotelId == null) {
			String errorMessage = String.format("***Impossible to remove without inserting Id!***");
			model.addAttribute("errorMessage", errorMessage);

			return "/project/red/hotels";
		}

		try {
			repo.deleteById(hotelId);
			model.addAttribute("hotels", repo.findAll());
			model.addAttribute("hotelDeleted", "***Hotel deleted!***");

		} catch (Exception ex) {
			model.addAttribute("unexistingdId", "***Unexisting Id!***");
		}

		return "/project/red/hotels";

	}

	@GetMapping("/project/red/editHotel")
	public String edit(@RequestParam long hotelId, Model model) {

		log.trace("edit hotel");

		Optional<Hotel> opt = repo.findById(hotelId);
		if (opt.isPresent()) {
			Hotel hotel = opt.get();

			model.addAttribute("hotelId", hotel.getHotelId());
			model.addAttribute("hotelName", hotel.getHotelName());
			model.addAttribute("city", hotel.getCity());
			model.addAttribute("roomCounter", hotel.getRoomCounter());
		}

		return "/project/red/editHotel";

	}

	@GetMapping("/project/red/saveHotel")
	public String save(@RequestParam long hotelId, @RequestParam String hotelName, @RequestParam String city,
			@RequestParam long roomCounter, Model model) {

		log.trace("saving modified hotel");
		Hotel hotel = new Hotel(hotelId, hotelName, city, roomCounter);
		repo.save(hotel);
		model.addAttribute("okEdit", "***Hotel modified!***");
		model.addAttribute("hotels", repo.findAll());

		return "/project/red/hotels";
	}
}