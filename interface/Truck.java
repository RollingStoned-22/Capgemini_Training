package interfaces;

public class Truck extends AbstractVehicle {
	public Truck(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("Truck started");
	}

	@Override
	public void stop() {
		System.out.println("Truck stopped");
	}

	@Override
	public void displayType() {
		System.out.println("Vehicle is a Truck");
	}
}
