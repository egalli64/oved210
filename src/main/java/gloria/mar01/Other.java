package gloria.mar01;

public class Other extends Base {

	public Other(int x, String y) {
		super(x, y);

	}

	@Override
	public void doSomething() {
		System.out.println("something for other");
	}

	public int getValue() {
		return 42;
	}

}
