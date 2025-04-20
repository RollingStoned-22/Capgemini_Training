package march_29;

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

}
