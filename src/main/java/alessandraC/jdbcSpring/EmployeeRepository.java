package alessandraC.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import alessandraC.jdbcSpring.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

	List<Employee> findByLastName(String lastName); // fa una ricerca nella lista dei country sui nomi

}
