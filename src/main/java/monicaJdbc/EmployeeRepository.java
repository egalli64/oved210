package monicaJdbc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long>{       // crud sono le operazioni di base che faccio sui database

	
	List<Employee> findByLastName(String lastname);
}

