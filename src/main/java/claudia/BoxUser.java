package claudia;

public class BoxUser {
public static void main(String[] args) {
Box box = new Box(12.5, 2.55, 10.7);

//box.setX(40);

System.out.println("Box x: " + box.getX());
System.out.println("Volume is: " + box.getVolume());

Box box2 = new Box(2.5, 0.55, 1.66);


System.out.println("Box2 is: "+ box2.getVolume());

Box box3 = new Box();
System.out.println("Box3 volume is:" + box3.getVolume());



CubicBox cb = new CubicBox(5);
System.out.println("CB Volume is: " + cb.getVolume());
}




}
