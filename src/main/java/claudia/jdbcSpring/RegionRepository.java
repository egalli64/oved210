package claudia.jdbcSpring;

import org.springframework.stereotype.Repository;

import claudia.jdbcSpring.entities.Region;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long>{
	List<Region>findByName(String name);
}
