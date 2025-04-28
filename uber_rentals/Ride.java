package uber_rental_management_system;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;

	public Ride(Customer customer, Driver driver) {
		this.customer = customer;
		this.driver = driver;
		this.status = "Booked";
	}

	public void completeRide() {
		this.status = "Completed";
		driver.setAvailable(true);
	}

	public String getStatus() {
		return this.status;
	}

	public String rideDetails() {
		return customer.name + " " + driver.name + " " + this.getStatus();
	}
}
