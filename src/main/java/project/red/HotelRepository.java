package project.red;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository <Hotel, Long> {
	@Override
	List<Hotel> findAll();

}
