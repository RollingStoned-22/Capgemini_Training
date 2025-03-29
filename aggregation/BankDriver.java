package aggregation;

public class BankDriver {
	public static void main(String[] args) {
		Customer c = new Customer("Shuvam Majumder");
		Bank b = new Bank(c,"HDFC");
		b.display();
		b = null;
		System.out.println(c.customerName);
		System.out.println(b);
	}
}
