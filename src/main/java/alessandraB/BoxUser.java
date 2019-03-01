package alessandraB;

public class BoxUser {
	public static void main(String[] args) {
		System.out.println( " How many boxes ?" + Box.getCounter());
		Box box = new Box(10,10,10);
	
		Box box2 = new Box(1,2,3);   //questo sistema è utile per gestire più variabili di valore diverso
        Box box3 = new Box();
        
        System.out.println( " How many boxes ?" + Box.getCounter());


		box.setX(40); //ho cambiato il valore set di x
	
		System.out.println(" Box x: " + box.getX());
	    System.out.println(" Volume is: " + box.getVolume());
	    System.out.println(" Box2 is: " + box2.getVolume());
	    System.out.println(" Box3 volume is: " + box3.getVolume());
	    
	    System.out.println(box); //in automatico JAVA va a cercare il metodo toString
	    System.out.println(box.toString()); //sono due scritture equivalenti
	    
	    CubiBox cb = new CubiBox(5);
	    System.out.println("CB volume is:  " + cb.getVolume());
		System.out.println(cb.toString());
		
		System.out.println( " How many boxes ?" + Box.getCounter());

	}
	}
	


