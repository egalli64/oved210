package elmonda;

public class Box {
	protected double x; // oppure double x_;
	protected double y;
	protected double z;
	
	public Box () {
	}
	
	
	
	public double getX() {
		return x;  // mi va  aprendere la proprietà x e me la ritorna
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
	public Box(double x, double y, double z) { //  costruttore -->mi aspetto che vengano passati 3 parametri x,y,z
		this.x = x;  // e quindi x_ = x;
		this.y = y; // la componente y della scatola che è uguale alla y che mi arriva come componente
		this.z = z;
	}
	public double getVolume() {
		return x * y *z;
	}
	
	@Override
	public String toString() {
		return "Box [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	}


// riga 4, se scrivo private double, la x è visibile solo in questa classe