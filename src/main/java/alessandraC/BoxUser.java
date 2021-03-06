package alessandraC;

public class BoxUser {
	public static void main(String[] args) {
		System.out.println();
		Box box = new Box(10, 10, 10);
		Box box2 = new Box(1, 2, 3);
		Box box3 = new Box();

		box3.setX(40);

		System.out.println("Box x: " + box.getX());
		System.out.println("Volume is: " + box.getVolume());
		System.out.println("Box2 volume is: " + box2.getVolume());
		System.out.println("Box 3 volume is: " + box3.getVolume());

		System.out.println(box.toString());

		CubicBox cb = new CubicBox(5);
		System.out.println("CB volume is: " + cb.getVolume());
		System.out.println(cb.toString());

	}
}
