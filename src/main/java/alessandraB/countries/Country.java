package alessandraB.countries;

// dovrò avere un paio di proprietà:
// id (for ex. "IT")
// name (for ex. "Italy")

public class Country {
	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}


	private String id;  // se metto private, questa variabile è visibile solo all'interno del package countries.
	private String name;
	

	public Country(String id, String name) {
		this.id = id;
		this.name = name;
		
	}
	

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
}

 // country estende la classe Oggetto (la base di tutte le classi)
	           // la toString in Object stampa qualcosa di simile all'indirizzo di memoria di quell'oggetto
	          // non stampa quindi qualcosa di sensato, per questo utilizzamo to String ridefinendola in modo
	          // da avere informazioni su come sia fatto l'oggetto reale /length è il numero di elementi in country
	