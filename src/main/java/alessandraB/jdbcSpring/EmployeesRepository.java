package alessandraB.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface EmployeesRepository extends CrudRepository<Employee, String> {
	List<Employee> findByLastName(String name);



}
