package claudia.mar01;

public class Derived extends Base {
	double z;
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
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
	Derived derived = new Derived(12, "hello");
	
	public double getMyStatus() {
		return 2.4;
	}

}
