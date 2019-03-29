package francesca.jdbc.Spring;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import francesca.jdbc.Spring.Entities.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String>{
 List<Country>	findByName(String name);

}


