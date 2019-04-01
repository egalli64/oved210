package donatella.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import donatella.jdbcSpring.entities.Region;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long>{
	List<Region>findByName(String name);

}
