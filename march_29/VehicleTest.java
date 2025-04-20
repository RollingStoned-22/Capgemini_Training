package march_29;

public class VehicleTest {
	public static void main(String[] args) {
		Car car = new Car("Bughati Veyron", 120);
		Bike bike = new Bike("Kawasaki Ninja 650", 90);
		Truck truck = new Truck("Ashok Leyland", 10);

		car.displayDetails();
		car.start();
		car.accelerate(20);
		car.getCurrentSpeed();
		car.brake(40);
		car.getCurrentSpeed();
		car.stop();
		System.out.println("..............................................................");
		bike.displayDetails();
		bike.start();
		bike.accelerate(50);
		bike.getCurrentSpeed();
		bike.brake(10);
		bike.getCurrentSpeed();
		bike.stop();
		System.out.println("..............................................................");
		truck.displayDetails();
		truck.start();
		truck.accelerate(20);
		truck.getCurrentSpeed();
		truck.brake(10);
		truck.getCurrentSpeed();
		truck.stop();
	}
}
