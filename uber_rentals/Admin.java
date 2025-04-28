package uber_rental_management_system;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role = "Admin")
public class Admin extends User {
	public Admin(String id, String name) {
		super(id, name);
	}

	@Override
	public void showProfile() {
		System.out.println("Admin name: " + name);
		Class<SecurityCheck> c = SecurityCheck.class;
		SecurityCheck s = c.getDeclaredAnnotation(c);
		System.out.println("Admin role: " + s.role());
	}

	public void removeDriver(List<Driver> drivers, String driverID) {
		Class<SecurityCheck> c = SecurityCheck.class;
		SecurityCheck s = c.getDeclaredAnnotation(c);
		if (c.isAnnotationPresent(SecurityCheck.class) && s.role().equalsIgnoreCase("Admin")) {
			Iterator<Driver> itr = drivers.iterator();
			while (itr.hasNext()) {
				Driver d = (Driver) itr.next();
				if (d.id == driverID)
					itr.remove();
			}
		}
	}
}
