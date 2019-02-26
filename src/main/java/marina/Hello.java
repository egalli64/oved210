package marina;

public class Hello {
	private static int month = 5;
	
public static void main(String[] args) {
	char flag = 'A';
	int counter  = 0;
	
	System.out.println("Counter is " + counter + " flag is " + flag + " and month is" + month);
	
	
	
	if(counter == 0) {
		System.out.println("As expected");
		
	} else if (flag != 'B') { 
		System.out.println("Surprising!");
	}
	else { System.out.println("Never printed");
	
	}
	switch (month) {
	case 1:
		System.out.println("31 days");
	break;
	case 2:
		System.out.println("28 days");
		break;
		
		default:
			System.out.println("other");
			break;
				}
	counter = counter + 1;
	System.out.println("Counter is " + counter);

	counter = counter++;
	System.out.println("Counter is " + counter);

	counter += 1;
		System.out.println("Counter is " + counter);
	
   }
}
