package sara.mar18;

public class Derived2 extends Base{
	@Override
	public void k() {
		System.out.println("Derived.k()");
		super.k();
	}

}
