package claudiaprimasettimana;

public class Person {
	protected static int counter = 0;{
		System.out.println("How many persons?" + Person.counter);}	
	
	
	private int age;
	private double height;

	public Person(int age, double height) {
		this.age = age;
		this.height = height;
		
		
		
		
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

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + "]";
	}

}
