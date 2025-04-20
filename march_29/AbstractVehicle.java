package march_29;

public abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;

	public AbstractVehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	protected void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Speed: " + speed+"kmph");
	}

	@Override
	public void accelerate(int increment) {
		this.speed += increment;
	}

	@Override
	public void brake(int decrement) {
		this.speed -= decrement;
	}

	public void getCurrentSpeed() {
		System.out.println("Speed: " + this.speed+"kmph");
	}

}
