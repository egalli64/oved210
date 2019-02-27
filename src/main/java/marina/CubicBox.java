package marina;

public class CubicBox extends Box {

	public CubicBox(double x) {
		super(x, x, x);

	}

	@Override
	public String toString() {
		return "CubicBox [x=" + x + "]";

	}
}
