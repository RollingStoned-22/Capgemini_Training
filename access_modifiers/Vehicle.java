package access_modifiers;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	
	public void displayDetails() {
		System.out.print(vehicleNumber+"\t"+brand+"\t"+model+"\t"+rentalPricePerDay+"\t"+isAvailable);
	}
	public void rentVehicle() {
		if(isAvailable)
			System.out.println(" Vehicle is available for rent");
		else
			System.out.println(" Vehicle is unavailable for rent");
	}
}
