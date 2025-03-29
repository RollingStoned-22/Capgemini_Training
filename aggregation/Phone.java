package aggregation;

public class Phone {
	String name;
	Sim s;
	public Phone(String name, Sim s) {
		this.name = name;
		this.s = s;
	}
	public void display() {
		System.out.println(this.name+"\t"+this.s.phoneNo);
	}
}
