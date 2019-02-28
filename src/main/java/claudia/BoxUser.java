package claudia;

public class BoxUser {
public static void main(String[] args) {
	
	System.out.println("How many boxes?" + Box.counter);
Box box = new Box(12.5, 2.55, 10.7);
Box box2 = new Box(2.5, 0.55, 1.66);
Box box3 = new Box();
System.out.println("How many boxes?" + Box.counter);

//box.setX(40);

System.out.println("Box x: " + box.getX());
System.out.println("Volume is: " + box.getVolume());




System.out.println("Box2 volume is: "+ box2.getVolume());


System.out.println("Box3 volume is:" + box3.getVolume());

System.out.println("How many boxes?" + Box.counter);

CubicBox cb = new CubicBox(5);
System.out.println("CB Volume is: " + cb.getVolume());

System.out.println("How many boxes?" + Box.counter);
}


}
