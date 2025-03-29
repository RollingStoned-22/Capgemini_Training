package interfaces;

public class Car extends AbstractVehicle {
	public Car(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

	@Override
	public void displayType() {
		System.out.println("Vehicle is a Car");
	}
}
