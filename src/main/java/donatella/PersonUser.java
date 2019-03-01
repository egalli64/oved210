package donatella;

public class PersonUser {

	public static void main(String[] args) {
		System.out.println("How many person?"+ Person.counter);
		Person[]persons = new Person[5];
		
persons[0]= new Person(5,0.37);
persons[1]= new Person (42,1.85);
persons[2]= new Person (21,1.72);
persons[3]= new Person (74,2.04);
persons[4]= new Person (18,1.61);
				
		for(int i=0;i < 5;i++) {System.out.println("Person"+ i+":"+persons[i]);
		
		if(persons[i].getAge() >40) {
			System.out.println("Person"+ i +":" + persons [i]);
		}
		
		
	
		if(persons[i].getAge()>40 && persons[i].getHeight()> 1.70) System.out.println("Person"+"i" + persons [i]);
		
		}
		
		
		
		}

		
	}


