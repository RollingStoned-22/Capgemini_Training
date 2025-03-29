package composition;

public class Phone {
	String phoneName;
	Battery b;
	
	public Phone(String phoneName, String batteryType) {
		this.phoneName = phoneName;
		this.b = new Battery(batteryType);
	}
	
	public void display() {
		System.out.println(phoneName+"\t"+b.batteryType);
	}
}
