package tiziana.PrimaSettimana;

public class TriangleRectangle extends Figure implements Colored {

	public TriangleRectangle(double x, double y) {
		super(x, y);
	}

	@Override
	public double area() {
		return x * y / 2;
	}

	@Override
	public String getColor() {
		return "yellow";
	}
}
