package francesca;

public class Hello {
	private static int month = 5;

	public static void main(String[] args) {
		System.out.println("hello");
		char flag = 'A';
		int counter = 0;
		Integer c2 = 0;
		Integer c2b = new Integer(0);

		// long largeValue = 0;
		System.out.println(" Counter is " + counter + " flag is " + flag + " and total is " + month);
		if (counter == 0) {
			System.out.println("As expected");
		} else if (flag != 'B') {
			System.out.println("Surprising");
		} else {
			System.out.println("Never printed");
		}

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
		// i've seen a target!
		counter = counter + 1;
		counter = counter++;
		// counter = ++counter;

		counter += 1;
		System.out.println(" Counter is " + counter);
		
	}
}
