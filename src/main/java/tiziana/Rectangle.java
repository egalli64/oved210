package tiziana.primasettimana;

public class Rectangle extends Figure implements Colored {

	public Rectangle(double x, double y) {
		super(x, y);
	}

	@Override
	public double area() {
		return x * y;
	}

	@Override
	public String getColor() {
		return "blue";
	}
}
