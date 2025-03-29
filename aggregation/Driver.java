package aggregation;

public class Driver {
	public static void main(String[] args) {
		Sim s = new Sim(123654795L);
		Phone phone = new Phone("Motorola", s);
		phone.display();
		System.out.println(phone);
		System.out.println(phone.s.phoneNo);
	}
}
