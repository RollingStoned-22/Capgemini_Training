package interfaces;

public class VehicleTest {
	public static void main(String[] args) {
		AbstractVehicle car = new Car("Corvette", 250);
		AbstractVehicle bike = new Bike("Kawasaki", 190);
		AbstractVehicle truck = new Truck("Ashok Leyland", 120);
		car.displayType();
		car.start();
		car.getCurrentSpeed();
		car.accelerate(20);
		car.getCurrentSpeed();
		car.brake(50);
		car.getCurrentSpeed();
		car.displayDetails();
		System.out.println();
		bike.displayType();
		bike.start();
		bike.getCurrentSpeed();
		bike.accelerate(20);
		bike.getCurrentSpeed();
		bike.brake(50);
		bike.getCurrentSpeed();
		bike.displayDetails();
		System.out.println();
		truck.displayType();
		truck.start();
		truck.getCurrentSpeed();
		truck.accelerate(20);
		truck.getCurrentSpeed();
		truck.brake(50);
		truck.getCurrentSpeed();
		truck.displayDetails();
		System.out.println();

	}
}
