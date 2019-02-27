package mariangela;

public class Person2 {

	protected static int counter = 0;

	private int age;
	private double height;

	public Person2() {
		Person2.counter += 1;
	}

	public Person2(int age, double height) {
		this.age = age;
		this.height = height;

		Person2.counter += 1;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Person2 createKid() {
		return new Person2(0, height / 10); // creare una nuova persona che abbia un'altezza pari a quella della persona
											// 0 / 10
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + "]";
	}

	public static int getCounter() {
		return counter;
	}

}
