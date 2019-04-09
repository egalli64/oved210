package project.green;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenhotelRepository extends CrudRepository<GreenHotel, String> {
}
