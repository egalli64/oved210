package project.blue;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlueClientRepository extends CrudRepository<BlueClient, Long> {
	
//	List<BlueClient> findAllByOrderById();
	
}