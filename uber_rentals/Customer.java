package uber_rental_management_system;

public class Customer extends User {

	Customer(String id, String name) {
		super(id, name);
	}

	@Override
	public void showProfile() {
		System.out.println("Customer name: " + this.name);
	}
}
