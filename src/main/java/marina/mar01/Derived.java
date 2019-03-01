package marina.mar01;

public class Derived extends Base {
	private double z;

	public Derived(int x, String y) {
		super(x, y);

		this.z = x / 3.0;
	}

}
