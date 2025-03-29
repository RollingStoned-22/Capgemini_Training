package abstraction;

public class Bike extends Vehicle {
	
	@Override
	public void start() {
		System.out.println("Bike is starting");
	}
	public void stop() {
		System.out.println("Bike is stopping");
	}
}
