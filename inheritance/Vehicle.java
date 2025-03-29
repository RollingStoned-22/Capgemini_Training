package inheritance;

public class Vehicle {
	String name;
	String engineType;
	
	public Vehicle(String name, String engineType) {
		this.name = name;
		this.engineType = engineType;
		System.out.println("parent");
	}
	
}
