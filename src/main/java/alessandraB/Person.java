package alessandraB;

public class Person {
    public static int counter = 0;
	private int age;
	private double height;
	
	
	public Person () { 
		Person.counter += 1; 
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Person.counter = counter;
	}
	public Person(int age, double height) {
		this.age = age;
		this.height = height;
		Person.counter += 1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) { // void vuol dire che il metodo set.age non mi ritorna nulla
		this.age = age; 
		
		// void non ritorna nulla perchè noi settiamo il valore
		// ipoteticamente people [1].setAge( 22)
		// --> ho settato l'età della persona 1 a 22 anni
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

