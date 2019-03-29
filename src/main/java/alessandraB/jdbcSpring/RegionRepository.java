package alessandraB.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import alessandraB.jdbcSpring.entities.Region;

@Repository // create read update delete --> CRUD, operazioni che si fanno sul database,
			// possono essere committate o rollbackate
public interface RegionRepository extends CrudRepository<Region, Long> {
	List<Region> findByName(String name);

}
