package access_modifiers;

public class VehicleDriver {
	public static void main(String[] args) {
		Car car = new Car("0493","Tesla","Cybertruck",4900.50,false, 4);
		Bike bike = new Bike("9576","Ola","S1X",1050.80,true, false);
		car.displayDetails();
		bike.displayDetails();
	}
}
