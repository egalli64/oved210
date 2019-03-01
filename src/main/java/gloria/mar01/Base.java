package gloria.mar01;

public class Base {
	protected int x;
	protected String y;
	
	
			
	public Base(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//metodi base che mi permettono di accedere alle mie proprietà.
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
	
	
	@Override
	public String toString() {
	 return "Base [x=" + x + ", y=" + y + "]";
	//permette di stampare la mia classe
	}
		
}
