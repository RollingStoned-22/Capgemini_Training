package access_modifiers;

public class Car extends Vehicle {
	private int numberOfDoors;
	
	public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors) {
		super(vehicleNumber,brand,model, rentalPricePerDay, isAvailable);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetails() {
		super.displayDetails();
		rentVehicle();
		System.out.print("\t"+numberOfDoors);
	}
}
