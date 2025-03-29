package interfaces;

public abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;

	public AbstractVehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	void displayDetails() {
		System.out.println("Vehicle name: " + this.name);
		System.out.println("Vehicle speed: " + this.speed);
	}

	@Override
	public void accelerate(int increment) {
		this.speed = this.speed + increment;
	}

	@Override
	public void brake(int decrement) {
		this.speed = this.speed - decrement;
	}

	@Override
	public void getCurrentSpeed() {
		System.out.println(this.speed);
	}

}
