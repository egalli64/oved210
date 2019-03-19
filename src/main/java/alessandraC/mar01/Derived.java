package alessandraC.mar01;

import alessandraC.mar18.Happy;

public class Derived extends Base implements Happy {

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

	@Override
	public void smile() {
		
	}

}
