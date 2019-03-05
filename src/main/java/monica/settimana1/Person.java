package monica.settimana1;

public class Person {

	protected static int counter = 0;

	int age;
	double height;

	public Person(int age, double height) {

		Person.counter += 1;

		this.age = age;
		this.height = height;
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

}
