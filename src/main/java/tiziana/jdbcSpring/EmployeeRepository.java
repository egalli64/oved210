package tiziana.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tiziana.jdbcSpring.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	List<Employee> findBylastName(String name);


}
