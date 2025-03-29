package inheritance;

public class Driver {
	public static void main(String[] args) {
		Bike bike = new Bike("Continental GT 650", "Twin Cylinder", 55);
		System.out.println(bike.name+"\t"+bike.engineType+"\t"+bike.bhp+"bhp");
	}
}