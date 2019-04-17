package project.red;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookingRepository 
	extends CrudRepository <Booking, Long> {
	
	@Override
	List<Booking> findAll();
	

}
