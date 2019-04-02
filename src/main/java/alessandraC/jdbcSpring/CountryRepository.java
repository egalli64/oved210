package alessandraC.jdbcSpring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
	
	List <Country> findByName(String name);							//fa una ricerca nella lista dei country sui nomi

}
