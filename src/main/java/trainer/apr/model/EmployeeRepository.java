package trainer.apr.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByLastName(String lastName);

    List<Employee> findByJobIdOrderById(String jobId);

    List<Employee> findByJobIdOrderByLastName(String jobId);

    List<Employee> findByJobIdOrderByFirstName(String jobId);

    Optional<Employee> findByIdAndJobId(Long id, String jobId);
    
    Page<Employee> findByJobId(String jobId, Pageable pageable);
    List<Employee> findByJobId_(String jobId, Pageable pageable);
    List<Employee> findByJobId(String jobId, Sort sort);
}
