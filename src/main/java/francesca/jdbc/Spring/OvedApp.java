package francesca.jdbc.Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import francesca.jdbc.Spring.Entities.Region;
import francesca.jdbc.Spring.Entities.Country;



@SpringBootApplication
public class OvedApp {
	
	
		private static final Logger log = LoggerFactory.getLogger(OvedApp.class);

		public static void main(String[] args) {
			log.info("I've just entered the main method");
			SpringApplication.run(OvedApp.class, args);
		}
		
		
		
		@Bean
		public CommandLineRunner onRegion(RegionRepository repo) {
			return(args) -> {
				Iterable<Region> iterable = repo.findAll();
				for(Region Region: iterable) {
			System.out.println("Working with region " + Region);
			
				}
				System.out.print("Find all 'Asia' region: ");
	  		System.out.print(repo.findByName("Asia")); 
		
		};
		}
		
		
		@Bean
		public CommandLineRunner Employee(EmployeeRepository repo) {
			return(args) -> {
				Iterable<Employee> iterable = repo.findAll();
				for(Employee Employee: iterable) {
			System.out.println("Working with Employee " + Employee);
			
				}
				System.out.print("Find all 'King' employee: ");
	  		System.out.print(repo.findByLastName("King")); 
		
		};
		
		}
		@Bean
		public CommandLineRunner EmployeeCreate(EmployeeRepository repo) {
			return(args) -> {
				System.out.println("Create a new programmer: ");
				Employee Employee = new Employee  ("Bill", "Clinton", "BCLINTON", "IT_PROG");
				System.out.println(Employee);
				repo.save(Employee);
				System.out.println(Employee);
			};
			
			
		
		}
}

