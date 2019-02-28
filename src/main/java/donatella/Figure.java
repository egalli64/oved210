package donatella;

public  abstract class Figure {
	protected double x;
	protected double y;
	
	public Figure (double x, double y) {
		this.x=x;
	    this.y=y;
	}
	
public abstract double area();

public String getColors() {
	// TODO Auto-generated method stub
	return null;
}

}
