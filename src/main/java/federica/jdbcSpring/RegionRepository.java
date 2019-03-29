package federica.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import federica.jdbcSpring.entities.Region;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {
	List<Region> findByName(String name);
}
