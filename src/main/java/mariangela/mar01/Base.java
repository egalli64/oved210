package mariangela.mar01;

public abstract class Base {
	protected int x;
	protected String y;

	public Base(int x, String y) {
		super();

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

	@Override
	public String toString() {
		return "Base [x=" + x + ", y=" + y + "]";
	}


}
