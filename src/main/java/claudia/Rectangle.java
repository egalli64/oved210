package claudia;

public class Rectangle  extends Figure {
	
	public Rectangle(double x, double y) {
		super(x, y);
	}
	
	@Override
	public double area() {
		return x * y;
	}

	
	}



