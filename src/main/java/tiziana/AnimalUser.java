package tiziana;

public class AnimalUser {
	public static void main(String[] args) {
		Animal[] animals = new Animal [2];
		
		
		animals[0]=new Dog("Aron",3500);
		animals[1]=new Cat("Ketty",900);
		
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
	}
	
	

	
	
}
