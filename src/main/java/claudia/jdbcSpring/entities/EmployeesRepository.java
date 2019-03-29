package claudia.jdbcSpring.entities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import claudia.jdbcSpring.Employee;

@Repository
public interface EmployeesRepository extends CrudRepository<Employee, Long>{
	List<Employee>findByLastName(String lastName);
}



