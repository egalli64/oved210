package tiziana;

public class Person2 {
	protected static int counter=0;
	
	public Person2() {
		Person2.counter += 1;
	}
	
	
	private int age;
	private double height;
	
	
	
	
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


	public Person2(int age, double height) {
		this.age=age;
		this.height=height;
		
		Person2.counter += 1;
	}


	public static int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		Person2.counter = counter;
	}
	
	
	
}
	