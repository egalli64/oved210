package francesca.mar01;

public abstract class Base {
	protected int x;
	protected String y;
	
	public Base() { // --> Costruttore di Default ( CTRL spazio )
	}
	
	
	
	
	public Base(int x, String y) {
		this.x = x;
		this.y = y;
		
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	
	
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
	public abstract void doSomething();


	// @Override // -> andare in Source -> Generate to String()...
	// public String toString() {
		// return "Base [x=" + x + ", y=" + y + "]";
	}
	
	


