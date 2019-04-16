package trainer.apr.model;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryCtrl {
    private static final Logger logger = LoggerFactory.getLogger(CountryCtrl.class);

    @Autowired
    CountryRepository repo;

    @Autowired
    RegionRepository regionRepo;

    @GetMapping("/trainer/countries")
    public String allCountries(Model model) {
        logger.debug("All countries");
        model.addAttribute("countries", repo.findAll());
        return "/trainer/countries";
    }

    @GetMapping("/trainer/countries/select")
    public String selectCountry( //
            @RequestParam String id, //
            Model model) {
        logger.debug("Select country with id " + id);

        Optional<Country> country = repo.findById(id.toUpperCase());
        model.addAttribute("country", country.orElse(new Country(id, "unknown", null)));
        return "/trainer/country";
    }

    @GetMapping("/trainer/countries/startingBy")
    public String startingBy( //
            @RequestParam String name, //
            Model model) {
        logger.debug("countries starting by " + name);
        List<Country> countries = repo.findByNameLikeIgnoreCase(name + "%");

        model.addAttribute("message", " with name starting by " + name);
        model.addAttribute("countries", countries);
        return "/trainer/countries";
    }

    @GetMapping("/trainer/countries/region")
    public String countriesByRegion( //
            @RequestParam long id, //
            Model model) {
        Optional<Region> region = regionRepo.findById(id);
        logger.debug("Countries by region " + id);

        if (region.isPresent()) {
            Region cur = region.get();
            List<Country> countries = repo.findByRegion(cur);
            model.addAttribute("countries", countries);
            model.addAttribute("region", cur);
        } else {
            model.addAttribute("region", new Region(id, ""));
        }

        return "/trainer/countriesByRegion";
    }

    @GetMapping("/trainer/countries/save")
    public String saveCountry( //
            @RequestParam String cid, //
            @RequestParam String name, //
            @RequestParam long rid, //
            Model model) {
        Optional<Region> region = regionRepo.findById(rid);
        if (region.isPresent()) {
            Region cur = region.get();
            Country country = new Country(cid.toUpperCase(), name, cur);
            logger.debug("Save country " + country);
            repo.save(country);
            model.addAttribute("region", cur);
            model.addAttribute("countries", repo.findByRegion_id(rid));
            return "/trainer/countriesByRegion";
        } else {
            logger.error(String.format("Can't save country %d: missing region %d", cid, rid));
            model.addAttribute("countries", repo.findAll());
            return "/trainer/countries";
        }
    }

    @GetMapping("/trainer/countries/delete")
    public String deleteCountry( //
            @RequestParam String cid, //
            @RequestParam long rid, //
            Model model) {
        logger.debug("Delete country " + cid);

        repo.deleteById(cid);

        Optional<Region> region = regionRepo.findById(rid);
        if (region.isPresent()) {
            Region cur = region.get();
            model.addAttribute("region", cur);
            model.addAttribute("countries", repo.findByRegion(cur));
            return "countriesByRegion";
        } else {
            logger.warn("Missing region " + rid);
            model.addAttribute("countries", repo.findAll());
            return "/trainer/countries";
        }
    }
}
