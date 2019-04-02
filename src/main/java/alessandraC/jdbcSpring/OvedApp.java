package alessandraC.jdbcSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import alessandraC.jdbcSpring.Employee;
import alessandraC.jdbcSpring.CountryRepository;
import alessandraC.jdbcSpring.RegionRepository;
import alessandraC.jdbcSpring.Country;
import alessandraC.jdbcSpring.Region;

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
	public CommandLineRunner onEmployees(EmployeeRepository repo) {
		return (args) -> {
			Iterable<Employee> iterable = repo.findAll();
			for (Employee employee : iterable) {
				System.out.println("Working with employee " + employee);
			}
			System.out.println("Find all 'last name' employees:");
			System.out.println(repo.findByLastName("Pataballa"));
		};
	}

	@Bean
	CommandLineRunner employeesCreate(EmployeeRepository repo) {
		return (args) -> {
			System.out.println("Create a new programmer:");
			Employee employee = new Employee("Bill", "Clinton", "BCLINTON", "IT_PROG");
			repo.save(employee);
			System.out.println(employee);

		};

	}
}
