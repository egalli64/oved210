package donatella.jdbcSpring;


	import org.slf4j.Logger;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Bean;
	import org.slf4j.LoggerFactory;

	
	@SpringBootApplication
	public class OverApp {

		
			private static final Logger log= LoggerFactory.getLogger(OverApp.class);
					public static void main(String[] args) {
				log.info("I'm just entered the main method");
			    SpringApplication.run(OverApp.class, args);
			
		}
					
		@Bean
		public CommandLineRunner simple() {
			return (args) ->{
			log.trace("I'm in simple() now!");

	};
	}
		@Bean
		public CommandLineRunner another() {
			return (args) ->{
			log.trace("I'm in another() now!");

	};
	}
		
	}

