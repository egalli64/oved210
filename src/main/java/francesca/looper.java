package francesca;

public class looper {
  public static void main(String[] args) {
	for(int i = 0; i < 10; i++)  {
	  System.out.println("hello" + i);
	}

    
	System.out.println("*** While loop***");
	int i = 0;
    while(i<10) {
    	System.out.println("hello" + i);
    	i += 1;
    }

  
    i = 0;
    do {
    	System.out.println("hello" + i);
    	i +=1;
    
  } while (i<10);
  }
}