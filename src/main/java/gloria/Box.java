package gloria;

public class Box {
	protected static int counter = 0;

	protected double x;
	protected double y;
	protected double z;
	
	public Box() {
		Box.counter += 1;
	}
	
	public Box (double x, double y, double z) {
	     this.x = x; // significa che this.x deve essere uguale al parametro "double x" che mi sta passando
	     this.y = y;
	     this.z = z;

	     Box.counter += 1;
	      
	}
				
	
    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public double getVolume() {
	  return x * y * z;
	  
	}


	@Override
	public String toString() {  
		return "Box [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	public static int getCounter() {
		return counter;
    }
	
}



