package alessandraB.mar01;

public class Derived extends Base {
	private double z;

	public Derived(int x, String y) {
		super(x, y);  //da derived vado a chiamare un costruttore dalla classe madre che mi permette
		             // di accedere alle proprietà.
		
	this.z = x / 3.0;
	
	
	}
	@Override
	public String toString() {
		return "Derived [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

	
}
