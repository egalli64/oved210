package sara.countries;

// id e name sono oggetti di Country separati tra loro

public class Country {  
	 private String id;
	 private String name;
	 
	 
//con public è visibile a tutti
	 
     public Country (String id, String name) {
		 this.id = id;
		 this.name = name; 
		 
    }

     
    //si fa per il print, cosi ritorna a questa frase quando stampa
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	
}
