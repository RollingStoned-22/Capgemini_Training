package covariant_return_type;

public class Bike extends Vehicle {
	public Vehicle getObj() {
		return new Bike();
	}
}
