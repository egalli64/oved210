package gloria;

public class TriangleRectangle extends Figure {
	
	public TriangleRectangle (double x, double y) {
		super (x, y);
		
	}

	@Override
	public double area() {
		return x * y / 2;	

	}

	
	
}

