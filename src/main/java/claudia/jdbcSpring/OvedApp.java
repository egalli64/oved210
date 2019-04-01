package claudia.jdbcSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import claudia.jdbcSpring.entities.Country;
import claudia.jdbcSpring.entities.CountryRepository;
import claudia.jdbcSpring.entities.EmployeesRepository;
import claudia.jdbcSpring.entities.Region;

@SpringBootApplication
public class OvedApp {
	private static final Logger log = LoggerFactory.getLogger(OvedApp.class);

	public static void main(String[] args) {
		log.info("I've just entered the main method");
		SpringApplication.run(OvedApp.class, args);
	}

	@Bean
	public CommandLineRunner onRegion(RegionRepository repo) {
		return (args) -> {
 
			Iterable<Region> iterable = repo.findAll();
			for (Region region : iterable) {
				System.out.println("Working with region " + region);
			}
//			System.out.println(repo.findAll());
			;
			
			System.out.println(repo.findByName("Europe"));
		
		};
	}
	@Bean
	public CommandLineRunner onCountry(CountryRepository repo) {
		return (args) -> {
			Iterable<Country> iterable = repo.findAll();
			for (Country country : iterable) {
				System.out.println("Working with country " + country);
		}
			System.out.println("Find all 'Italy' countries:");
			System.out.println(repo.findByName("Italy"));
	};
}
	@Bean
	public CommandLineRunner onEmployee(EmployeesRepository repo) {
		return (args) -> {
			Iterable<Employee> iterable = repo.findAll();
			for (Employee employee : iterable) {
				System.out.println("Employees: " + employee);
		}
			
			System.out.println(repo.findByLastName("King"));
	};

}
	@Bean
	public CommandLineRunner employeeCreate(EmployeesRepository repo) {
		return (args) -> {
			System.out.println("Create a new programmer: ");
			Employee employee = new Employee("Homer", "Simpson", "SIMPSON", "IT_PROG");
			System.out.println(employee);
			repo.save(employee);
			System.out.println(employee);
			
	};



	}}
