package dd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Oved210Application {
	private static final Logger Log = LoggerFactory.getLogger(Oved210Application.class);
	
	public static void main(String[] args) {
		Log.info("I'm just entered the main method");
		SpringApplication.run(Oved210Application.class, args);
	}
	
@Bean 
public CommandLineRunner simple() {
	return (args) -> {
		Log.trace("I'm in simple() now!");
		};
		}
}