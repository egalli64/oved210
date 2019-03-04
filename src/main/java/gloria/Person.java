package gloria;

public class Person {
	private static int counter;
	private int age;
	private double height; // fino a qui definisco le prorpietà della classe

	public Person(int age, double height) { // costruisco il costruttore
		
		throw new IllegalArgumentException("Negative height is not accepted!!");

	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Person.counter = counter;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + "]";
	}

	public int getAge() { // metodo GET metodo pubblico che mi riporta all'intero
		return age;
	}

	public void setAge(int age) { // metodo SET
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;

	}

}
