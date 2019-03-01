package trainer.mar01;

public class Derived extends Base {
	private double z;
	
	public Derived(int x, String y) {
		super(x, y);
		
		this.z = x / 3.0;
	}

	@Override
	public String toString() {
		return "Derived [z=" + z + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public void doSomething() {
		System.out.println("something");
	}
}
