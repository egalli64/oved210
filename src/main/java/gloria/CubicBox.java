package gloria;

public class CubicBox extends Box {
	public CubicBox(double x ) {
		super (x, x, x);  //voglio costruire la classe madre di questa classe 		
	}

	
	@Override
	public String toString() {
		return "CubicBox [x="+ x +"]";
	}

	
	
	
}

