package project.green;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingsRepository 
	extends CrudRepository<Booking, Long> {

}