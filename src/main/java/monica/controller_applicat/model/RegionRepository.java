package monica.controller_applicat.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository 
	extends CrudRepository <Region, Long> {
		
	
}
