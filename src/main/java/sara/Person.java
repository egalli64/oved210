package sara;

public class Person {
	protected static int person = 0;
	
	private int age;
	private double height;
	
	//per fare un costruttore
	public Person(int age, double height) {
		
		if (age <= 0) {
		throw new IllegalArgumentException("Negative age is not accepted!!");
		
		}
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + "]";
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
