package one_to_many;

public class Bank {
	Customer[] customers;
	String bank_name;
	int count = 0;
	
	public Bank(String name, int size) {
		this.customers = new Customer[size];
		this.bank_name = name;
	}
	
	public void addCustomer(Customer customer) {
		if(count < customers.length) {
			customers[count++] = customer;
			System.out.println("Customer added");
		}
	}
	
	public void displayCustomers() {
		for(int i = 0; i < count; i++)
			System.out.println(customers[i].customer_name+"\t"+customers[i].id);
	}
}
