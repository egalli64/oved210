package elmonda.appc.projectGreen;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GreenClientsRepository 
	extends CrudRepository<GreenClients, String> {
	

}
