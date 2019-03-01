package gloria.mar01;

public class Derived extends Base{
	
public double z;	
	
public Derived(int x, String y) {
	super (x, y);  // super è il riferimento al costruttore della classe madre 
	
	this.z = x / 3.0;
	
}

@Override
public String toString() {
	return "Derived [z=" + z + ", x=" + x + ", y=" + y + "]";
}

@Override
public void doSomething() {
	System.out.println("something");
	
}
}

 
