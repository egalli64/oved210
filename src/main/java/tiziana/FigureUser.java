package tiziana;

public class FigureUser {
	public static void main(String[] args) {
		Figure f1 = new TriangleRectangle(3, 5);
		Figure f2 = new Rectangle(3, 5);
		System.out.println(f1);
		System.out.println(f2);

		Colored[] figures = new Colored[2];
		figures[0] = new Rectangle(3, 5);
		figures[1] = new TriangleRectangle(7, 1);
		System.out.println(figures[1].getColor());

	}
}
