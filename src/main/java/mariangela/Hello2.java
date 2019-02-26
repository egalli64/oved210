package mariangela;

public class Hello2 {
	
	public static void countdown () {
		System.out.println("Hello I'm in countdown! ");
		
		int [] months = new int [12];
		for(int i = 0; i < months.length; i++) {
			months [i] = months.length -1 - i;
		}
		
		System.out.println("Printing coutdown: ");
		for (int i = 0; i < months.length; i++) {
			System.out.println("Element " + i + " = " + months [i]);
	}
	
	System.out.println("Countdown completed ");
	}
	
	
public static void main(String[] args) {
	System.out.println("Hello");
	countdown();
	
//	int[] months = new int [12];
//	System.out.println("Months is sized " + months.length);
//	for (int i = 0; i < months.length; i++) {
//		months[i] = i * i;
//	}
	
//	int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	
//	System.out.println("Months is sized " + months.length);
//	for (int i = 0; i < months.length; i++) {
//		System.out.println("Element " + i + " = " + months [i]);
//	}
}
}
