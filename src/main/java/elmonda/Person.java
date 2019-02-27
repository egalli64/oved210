package elmonda;

public class Person {
	private int age;
	private double height; // rigo 4 e 5 proprietà della classe
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + "]";
	}

	public int getAge() {  // metodo pubblico, mi aspetto che mi ritorni un intero
		return age;
	}

	public void setAge(int age) {  // non mi ritorna niente
		this.age = age;
	}

	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	//  esempio: public Person createKid() {
		// return new Person(0, height

	public Person(int age, double height) { // costruttore
		this.age = age;
		this.height = height;
	}
	

}
