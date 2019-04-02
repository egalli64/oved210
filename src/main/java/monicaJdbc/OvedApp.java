package monicaJdbc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class OvedApp {
		
	private static final Logger log  = LoggerFactory.getLogger(OvedApp.class);
	
		public static void main(String[] args) {
		
		log.info("I'm just entered the main method ");
		
		SpringApplication.run(OvedApp.class, args);
	}

		
		//29/03/19 use JPA
//		@Bean
//		public CommandLineRunner region(RegionRepository repo) {//ritorna una funzione  (rappresentazione in java) args= argomento , -> ritorna, {} qualcosa
//			return args -> {    
//				repo.findAll();
//				Iterable<Region> iterable = repo.findAll();
//				for (Region region: iterable) {
//					System.out.println("Working whit region " + region);
//					}
//				
//			
//			};
//		}
//				
//			@Bean
//				public CommandLineRunner country(CountryRepository repo) {//ritorna una funzione  (rappresentazione in java) args= argomento , -> ritorna, {} qualcosa
//					return args -> {    
//						repo.findAll();
//						Iterable<Country> iterable = repo.findAll();
//						for (Country country: iterable) {
//							System.out.println("Working whit " + country);
//							}
//				System.out.println("Find all 'Italy' countries: ");
//				System.out.println(repo.findByName("Italy"));
//			};
//		}
//		
			
		@Bean
		public CommandLineRunner employee(EmployeeRepository repo) {
		return args -> {    
			repo.findAll();
				Iterable<Employee> iterable = repo.findAll();
				for (Employee employee: iterable) {
				System.out.println(" Employee " + employee);
					}
				System.out.println("Find all 'King' employee: ");
				System.out.println(repo.findByLastName("King"));
	};
}
		
		@Bean
		public CommandLineRunner employeeCreate(EmployeeRepository repo) {
		return args -> {  
			System.out.println("Create a new programmer: ");
			Employee employee = new Employee("Bill", "Clinton", "BCLINTN", "IT_PROG");
			System.out.println(employee);
			repo.save(employee);
			System.out.println(employee);
			
		};
			
		}
		
}
