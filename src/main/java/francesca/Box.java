package francesca;

public class Box {
	protected static int counter = 0; //la variabile counter è statica
	protected double x;
	protected double y;
	protected double z;
	
	public Box() {
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

	public Box(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		Box.counter += 1;
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

