package hello;

public class Hello {
	private static int month = 5;

	public static void main(String[] args) {
		char flag = 'A';
		int counter = 0;

		System.out.println("Counter is" + counter + "flag is" + flag + "and total is" + month);

		if (counter == 0) {
			System.out.println("Aspected");
		} else if (flag != 'B')
			System.out.println("Surprising!");
		counter = counter++;

		counter += 1;
		System.out.println("Counter is" + counter);

		switch (month) {
		case 1:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("28 days");
			break;
		default:
			System.out.println("other");
			break;

		}
	}
}