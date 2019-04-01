package federica.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import federica.jdbcSpring.entities.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
     List<Country> findByName(String name);
}
