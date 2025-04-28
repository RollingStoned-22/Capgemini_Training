package uber_rental_management_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.stream.Stream;

public class RideBookingSystem {
	List<Customer> customers;
	List<Driver> drivers;
	List<Ride> rides;

	void registerCustomer(Customer customer) {
		customers.add(customer);
	}

	void registerDriver(Driver driver) {
		drivers.add(driver);
	}

	Ride bookRide(Customer customer) {
		Stream<Driver> driver_str = drivers.stream();
		driver_str.filter((driver) -> driver.isAvailable() == true);
		if (driver_str.count() == 0) {
			throw new InvalidRideExceptionClass(" We're sorry for the inconvenience. No rides available at the moment");
		}
		Object[] available_drivers = driver_str.toArray();
		Ride ride = new Ride(customer, (Driver) available_drivers[0]);
		return ride;
	}

	void saveRides() throws Exception {
		String path = "C:\\Users\\User\\Desktop\\UberRentals\\rides.txt";
		File file = new File(path);
		for (Ride ride : rides) {
			String message = ride.rideDetails();
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < message.length(); i++)
				bw.write(message.charAt(i));
			bw.flush();
			fw.flush();
		}
	}

	void loadDriversFromFile() throws Exception {
		String path = "C:\\Users\\User\\Desktop\\UberRentals\\drivers.txt";
		File file = new File(path);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;

			boolean isHeader = true;

			while ((line = br.readLine()) != null) {
				if (isHeader) {
					isHeader = false;
					continue;
				}
				String[] values = line.split(",");
				String id = values[0];
				String name = values[1];
				System.out.println("Driver ID: " + id);
				System.out.println("Driver Name: " + name);
				Driver driver = new Driver(id, name);
				RideBookingSystem obj = new RideBookingSystem();
				obj.registerDriver(driver);
			}
		}
	}

	void saveDriversToFile() throws Exception {
		String path = "C:\\Users\\User\\Desktop\\UberRentals\\drivers.txt";
		File file = new File(path);
		for (Driver driver : drivers) {
			String message = driver.getID() + " , " + driver.getName();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < message.length(); i++)
				bw.write(message.charAt(i));
			bw.flush();
			fw.flush();
		}
	}
	
	public void showAllDrivers() {
		for(Driver driver : drivers)
			driver.showProfile();
	}
}
