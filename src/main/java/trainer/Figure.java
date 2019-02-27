package trainer;

public abstract class Figure {
	protected double x;
	protected double y;
	
	public Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double area();
}
