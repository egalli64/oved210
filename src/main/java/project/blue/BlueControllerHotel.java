package project.blue;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlueControllerHotel {
	private static final Logger log = LoggerFactory.getLogger(BlueController.class);
	private static String user;
	
	@Autowired
	private BlueHotelRepository repHotel;
	
	@GetMapping("/project/blue/hotels")
	public String allHotels(Model model) {
		log.trace("get all hotels");
		try {
			model.addAttribute("hotels", repHotel.findAll());
		} catch (Exception ex) {
			log.error("Can't get hotels", ex);
			return "/project/blue/reject";
		}
		return "/project/blue/hotels";
	}

	
	// controller add hotels
	
	@GetMapping("/project/blue/hotels/addHotel")
	public String addHotel( //
			@RequestParam String hotelName, //
			@RequestParam String city, //
			@RequestParam Long roomCounter, //
			Model model) {
		log.trace("get all hotels");

			BlueHotel hotel = new BlueHotel();

			hotel.setHotelName(hotelName);
			hotel.setCity(city);
			hotel.setRoomCounter(roomCounter);

			repHotel.save(hotel);
			model.addAttribute("hotels", repHotel.findAll());

			String SaveHotel = String.format("--New hotel inserted!--");
			model.addAttribute("SaveHotel", SaveHotel);

		return "/project/blue/hotels";
	}
	
	
	
	//controller remove hotels
	
	@GetMapping("/project/blue/hotels/remove")

	public String removeClient(@RequestParam Long hotelId, Model model) {
		log.trace("delete hotel");

		try {

			repHotel.deleteById(hotelId);

			model.addAttribute("hotels", repHotel.findAll());
			String deleteHotel = String.format("--Hotel deleted!--");
			model.addAttribute("deleteHotel", deleteHotel);

		} catch (Exception ex) {
			String unexistingdId = String.format("--Unexisting Id!--");
			model.addAttribute("unexistingdId", unexistingdId);
		}

		return "/project/blue/hotels";

	}
	
	// controller edit hotels
	
	@GetMapping("/project/blue/editHotel")
	public String editHotelFirst( //
			@RequestParam Long hotelId, //
			Model model) {
		log.trace("edit client");

		Optional<BlueHotel> opt = repHotel.findById(hotelId);
		if (opt.isPresent()) {
			BlueHotel hotel = opt.get();

			model.addAttribute("hotelId", hotel.getHotelId());
			model.addAttribute("hotelName", hotel.getHotelName());
			model.addAttribute("city", hotel.getCity());
			model.addAttribute("roomCounter", hotel.getRoomCounter());
		}
		return "/project/blue/editHotel";
	}

	@GetMapping("/project/blue/editHotel2")
	public String editClientSecond( //
			@RequestParam Long hotelId, @RequestParam String hotelName, //
			@RequestParam String city, //
			@RequestParam Long roomCounter, //

			Model model) {
		log.trace("edit hotel");

		BlueHotel hotel = new BlueHotel(hotelId, hotelName, city, roomCounter);

		repHotel.save(hotel);

		model.addAttribute("editHotel", "--Hotel modified!--");
		model.addAttribute("hotels", repHotel.findAll());

		return "/project/blue/hotels";	
	
	
	}

}

