package francesca.mar01;


public class Other extends Base {
	
	public Other(int x, String y) {
		super (x,y);
	}
	



	@Override
	public void doSomething() {
		System.out.println("Something for other");
	}




	public int GetValue() {
	return 42;
	}
	
}
	