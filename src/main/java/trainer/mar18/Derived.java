package trainer.mar18;

public class Derived extends Base implements Happy {
	@Override
	public void k() {
		System.out.println("Derived.k()");
		super.k();
	}

	@Override
	public void smile() {
		System.out.println("Derived.smile()");
	}
}
