package claudia.jdbcSpring.entities;
import org.springframework.stereotype.Repository;

import claudia.jdbcSpring.entities.Country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface CountryRepository extends CrudRepository<Country, String>{
	List<Country>findByName(String name);
}
