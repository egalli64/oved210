package francesca.jdbc.Spring;

	import java.util.List;

import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import francesca.jdbc.Spring.Entities.Region;

	@Repository
	public interface EmployeeRepository extends CrudRepository<Employee, Long>{
		List<Employee> findByLastName(String Lastname);
	}



