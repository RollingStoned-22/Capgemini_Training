package uber_rental_management_system;

public class Driver extends User {
	private boolean available;

	public Driver(String id, String name) {
		super(id, name);
		this.available = true;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public void showProfile() {
		System.out.println("Driver's name: " + this.name);
		System.out.println("Driver's availability: " + this.available);
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}
