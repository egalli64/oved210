package alessandraB.jdbcSpring.entities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import alessandraB.jdbcSpring.entities.Country;

@Repository // create read update delete --> CRUD, operazioni che si fanno sul database,
			// possono essere committate o rollbackate
public interface CountryRepository extends CrudRepository<Country, String> {

	List<Country> findByName(String name);

}
