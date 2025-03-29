package inheritance;

public class Bike extends Vehicle {
	int bhp;
	public Bike(String name, String engineType, int bhp) {
		super(name,engineType);
		this.bhp = bhp;
		System.out.println("Child");
	}
}
