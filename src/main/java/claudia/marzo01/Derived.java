package claudia.marzo01;

public class Derived extends Base {
	private double z;
	public Derived(int x, String y) {
	super(x, y);
	
	this.z = x / 3.0;
}
	@Override
	public String toString() {
		return "Derived [z=" + z + "]";
	}
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
}
