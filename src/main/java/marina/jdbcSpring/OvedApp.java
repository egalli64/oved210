package marina.jdbcSpring;

import marina.jdbcSpring.entities.Country;
import marina.jdbcSpring.entities.CountryRepository;
import marina.jdbcSpring.entities.Region;
import marina.jdbcSpring.entities.RegionRepository;
import marina.jdbcSpring.entities.Employee;
import marina.jdbcSpring.entities.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
				for (Country country : region.getCountries()) {
					System.out.println(" " + country.getName());
				}
			}
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
	public CommandLineRunner onEmployee(EmployeeRepository repo) {
		return (args) -> {
			Iterable<Employee> iterable = repo.findAll();
			for (Employee employee : iterable) {
				System.out.println("Working with employee " + employee.getLastName());

			}

			System.out.println("Find all 'Taylor' in employees:");
			System.out.println(repo.findByLastName("Taylor"));

			System.out.println("Find all 'Pataballa' in employees:");
			System.out.println(repo.findByLastName("Pataballa"));
		};
	}

	@Bean
	public CommandLineRunner employeeCreator(EmployeeRepository repo) {
		return (args) -> {
			System.out.println("Create a new programmer:");
			Employee employee = new Employee("Billy", "Ballo", "bballo", "IT_PROG");
			System.out.println(employee);
			repo.save(employee);
			System.out.println(employee);
		};

	}

}