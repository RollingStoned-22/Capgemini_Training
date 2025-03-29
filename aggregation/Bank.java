package aggregation;

public class Bank {
	String bankName;
	Customer c;
	public Bank(Customer c, String name) {
		this.c = c;
		this.bankName = name;
	}
	
	public void display() {
		System.out.println(this.bankName+"\t"+this.c.customerName);
	}
}
