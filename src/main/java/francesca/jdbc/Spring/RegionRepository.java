package francesca.jdbc.Spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import francesca.jdbc.Spring.Entities.Region;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long>{
	List<Region> findByName(String name);
}
