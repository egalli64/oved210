package marina.jdbcSpring.entities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends CrudRepository <Employee, String> {
	
	List <Employee> findByLastName(String lastName);
		
}
