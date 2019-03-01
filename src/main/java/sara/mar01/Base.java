package sara.mar01;

public class Base {
	protected int x;  
	protected String y;
	
	//costruttore di default                *per creare una classe estesa*
	public Base() {
	}
	
	public Base(int x, String y) {      // andare in Source --> generate constructor and fields
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {                 // andare in Source --> generate getting and setter
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
	@Override                                  // andare in Source --> generate toString
	public String toString() {
		return "Base [x=" + x + ", y=" + y + "]";
	}
			
	
	
	
    
    }

