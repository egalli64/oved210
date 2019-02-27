package elmonda;

public class CubicBox extends Box {
	public CubicBox(double x) {
		super(x, x, x);  // con super rispetto a this  indico che voglio andare a lavorare con la classe madre di questa classe	
	}

	@Override
	public String toString() {
		return "CubicBox [x=" + x + "]";
	}
}
