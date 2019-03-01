package monica.simple;

public abstract class Base {
	protected int x;
	protected String y;
	
	protected Base() {}
//	costruttore di default
	
	public Base(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Base [x=" + x + ", y=" + y + "]";
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
	

}

