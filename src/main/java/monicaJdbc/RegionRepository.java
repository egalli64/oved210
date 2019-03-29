package monicaJdbc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository <Region, Long>{       // crud sono le operazioni di base che faccio sui database

	
	List<Region> findByName(String name);
}
