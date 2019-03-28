package federica;

public class ClothesUser extends Clothes {
	public static void main(String[] args) {
		System.out.println("Clothes");
		Clothes m = new Clothes();
		m.k();
		
		System.out.println("Trousers");
		Trousers s = new Trousers();
		s.k();
		
		Clothes[] array = {m, s, };
		for(Clothes clothes : array) {
			clothes.k();
		}
	}

}
