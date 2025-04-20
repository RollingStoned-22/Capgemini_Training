package march_29;

public class Car extends AbstractVehicle {

	public Car(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("Car Started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

}
