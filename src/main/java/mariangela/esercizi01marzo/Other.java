package mariangela.esercizi01marzo;

public class Other extends Base {

	public Other(int x, String y) {
		super(x, y);
		
	}

	@Override
	public void doSomething() {
		System.out.println("Something for other");
	}

	public int getValue( ) {
		return 42;
	}
	}
	


