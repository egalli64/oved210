package donatella.mar01;

public class Derived extends Base {
	private double z;
	
	public Derived (int x, String y) {
		super (x,y);
		
	this.z =x/3.0;
		
		
	
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("something");
		
	}

	public double getMyStatus() {
		return 2.4;
	}

}
