package elmonda;

public class AnimalUser {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		
		animals[0] = new Dog (35, "bob");
		animals[1] = new Dog (26, "rex");
		
		
		for(int i = 0; i < 2; i++) {
			
			System.out.println(animals [i]);
		}
		
	}

}
