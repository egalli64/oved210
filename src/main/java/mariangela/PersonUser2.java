package mariangela;

public class PersonUser2 {

	// constant
	private final static int NR_PERSONS = 5;

	public static void main(String[] args) {
		System.out.println("How many persons? " + Person2.getCounter());

		Person2[] persons = new Person2[NR_PERSONS];

		persons[0] = new Person2(5, 0.37);
		persons[1] = new Person2(42, 1.85);
		persons[2] = new Person2(21, 1.72);
		persons[3] = new Person2(74, 2.04);
		persons[4] = new Person2(18, 1.61);
		
		System.out.println("How many persons? " + Person2.getCounter());

		for (int i = 0; i < NR_PERSONS; i++) {
			System.out.println(i + ": " + persons[i]);
		}

		Person2 kid = persons[4].createKid();
		System.out.println("New person: " + kid);

		System.out.println("How many persons? " + Person2.getCounter());
	}
}
