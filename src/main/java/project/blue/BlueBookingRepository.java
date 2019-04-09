package project.blue;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlueBookingRepository extends CrudRepository<BlueBooking, Long> {

}
