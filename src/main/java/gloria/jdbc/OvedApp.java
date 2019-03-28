package gloria.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication  //mi sta dicendo che questa classe è vista come applicazione spring moderno
public class OvedApp {
	private static final Logger log = LoggerFactory.getLogger(OvedApp.class);
	public static void main(String[] args) {  // eseguimi la main con spring, ho un main che riceve un argomento e lo passa -->
		log.info("I'm just entered the main method");
		SpringApplication.run(OvedApp.class, args);  
		//dopo aver eseguito run vogliamo che spring mi chiami un metodo in cui posso inserirci roba , quindi vogliamo creare un metodo che verrà visto--->
		//come fa a lavorare spring? 
	}
	
	@Bean
	public CommandLineRunner simple() { // i cpmand line runner vengono eseguiti quando è completata la fase di setup,  CommandLineRunner è un oggetto che agisce come se fosse una funzione
		return (args) -> {//il mio metodo simple ritorna  questa cosa strana (args) -> {};, ovvero in termini java una funzione. una funzione è un metodo che non è associato a nessuna classe
		                    //(args) a sinistra argomenti in input , sono gli argomenti se li trova li richiama a destra  {} i codici body della funzione
		log.info("I'm in simple() now!");
	};
}
	@Bean
	public CommandLineRunner another() { // i cpmand line runner vengono eseguiti quando è completata la fase di setup,  CommandLineRunner è un oggetto che agisce come se fosse una funzione
		return (args) -> {//il mio metodo simple ritorna  questa cosa strana (args) -> {};, ovvero in termini java una funzione. una funzione è un metodo che non è associato a nessuna classe
		                    //(args) a sinistra argomenti in input , sono gli argomenti se li trova li richiama a destra  {} i codici body della funzione
			log.info("I'm in another() now!");
		};
	}
}
