package trainer.apr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OvedApplication {
	private static final Logger log = LoggerFactory.getLogger(OvedApplication.class);

	public static void main(String[] args) {
		log.trace("Starting up the Oved app");
		SpringApplication.run(OvedApplication.class, args);
	}
}
