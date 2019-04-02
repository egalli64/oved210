package mariangela.jdbcSpring;

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
		log.info("I'm just entered the main method");
		SpringApplication.run(OvedApp.class, args);
	}
//
//	@Bean
//	public CommandLineRunner simple(RegionRepository repo) {
//		return (args) -> {
//			Iterable<Region> iterable = repo.findAll();
//			for (Region region : iterable) {
//				System.out.println("Working with region " + region.getName());
//
//			}
//
//		};
//	}

//	@Bean
//	public CommandLineRunner onCountry(CountryRepository repo) {
//		return (args) -> {
//			Iterable<Country> iterable = repo.findAll();
//			for (Country country : iterable) {
//				System.out.println("Working with " + country);
//			}
//			System.out.println("Find all 'Italy' countries: ");
//			System.out.println(repo.findByName("Italy"));
//		};
//	}
//
//	@Bean
//	public CommandLineRunner onRegion(RegionRepository repo) {
//		return (args) -> {
//			Iterable<Region> iterable = repo.findAll();
//			for (Region region : iterable) {
//				System.out.println("Working with region " + region);
//			}
//			System.out.println("Find all 'Europe' regions: ");
//			System.out.println(repo.findByName("Europe"));
//		};
//	}

	@Bean
	public CommandLineRunner onEmployee(EmployeesRepository repo) {
		return (args) -> {
			Iterable<Employee> iterable = repo.findAll();
			for (Employee employee : iterable) {
				System.out.println("Working with employees " + employee.getLastName());
			}
			System.out.println("Find all 'Urman' employees: ");
			System.out.println(repo.findByLastName("Urman"));
		};

	}

	@Bean
	public CommandLineRunner employeeCreate(EmployeesRepository repo) {
		return (args) -> {
			System.out.println("Create a new programmer: ");
			Employee employee = new Employee("James", "Bond", "JBOND", "IT_PROG");
			System.out.println(employee);
			repo.save(employee);
			System.out.println(employee);
		};
	}
}
