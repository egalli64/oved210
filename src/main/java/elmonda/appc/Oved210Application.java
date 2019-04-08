package elmonda.appc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oved210Application {
	private static final Logger log = LoggerFactory.getLogger(Oved210Application.class);

	public static void main(String[] args) {
		log.trace("Starting up the Oved app");
		SpringApplication.run(Oved210Application.class, args);
	}
}
