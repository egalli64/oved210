package project.green;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GreenClientsRepository extends CrudRepository< GreenClients, String> {
	 void deleteById(String email);

}


//ORDER
	//List<GreenClients> findByClientNameOrderByClientName(List<GreenClients> clients);

