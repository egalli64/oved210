package tiziana.PrimaSettimana;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
	public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int target = random.nextInt(100);
    int value = -1;
    		
    		while(target != value) {
    
    
        System.out.println("Guess a number in[0:100]");
    	value = scanner.nextInt();
        System.out.println("Your choice is:"+ value );

        
        if(value<target) {
        	  System.out.println("Too low");
        } 
        
        if(value>target) {
      	System.out.println("Too high");
        } 
      
        
    System.out.println("Well done");
    
    scanner.close();
}
}
}
