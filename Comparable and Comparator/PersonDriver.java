package comparable_and_comparator;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person("Shuvam", 22);
		Person p2 = new Person("Shuvam", 32);
		compareByNameAndID(p1, p2);
	}

	public static void compareByNameAndID(Person p1, Person p2) {
		if (p1.compareTo(p2) > 0)
			System.out.println("P1 > P2");
		else if (p1.compareTo(p2) < 0)
			System.out.println("P1 < P2");
		else {
			System.out.println("P1 == P2");
			System.out.println(p1.compareTo(p2));
		}
			

	}
}
