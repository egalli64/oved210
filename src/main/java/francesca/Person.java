package francesca;

public class Person {
	private int age;
	private double height;
	
	public Person(int age, double height) {
		this.age = age;
		this.height = height;

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
		
		public Person createkid() {
			return new Person(0, height / 10);
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

}
