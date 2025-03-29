package interfaces;

public class Bike extends AbstractVehicle {
	public Bike(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("Bike started");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}

	@Override
	public void displayType() {
		System.out.println("Vehicle is a Bike");
	}
}
