package donatella;

public class BoxUser {
public static void main(String[] args) {
	System.out.println("How many boxes?"+ Box.counter);
	Box box = new Box(10,10,10);
	Box box2 = new Box(1,2,3);
	Box box3= new Box();
	System.out.println("How many boxes?" + Box.counter );
	
//	box.setX(40);
	

		System.out.println("Box x:"+box.getX());	
		
	System.out.println("volume is:"+box.getVolume());
	
	System.out.println("Box2 is:"+box2.getVolume());
	
	System.out.println("Box3 is"+box3.getVolume());
	
	System.out.println("How many boxes?" + Box.counter);
	
	CubicBox cb= new CubicBox(5);
	System.out.println("CB volume is :" + cb.getVolume());
	System.out.println(cb.toString());
	System.out.println("How many boxes?"+ Box.counter);
	
	
}
}