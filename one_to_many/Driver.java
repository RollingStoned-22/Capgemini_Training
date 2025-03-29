package one_to_many;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer count: ");
		int size = sc.nextInt();

		Bank bank = new Bank("HDFC", size);
		boolean flag = true;

		while (flag) {
			System.out.println("Enter choice: ");
			System.out.println("1. Add customer\n2. Display Customers\n3. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				sc.nextLine();
				System.out.println("Enter customer name and id: ");
				String cus_name = sc.nextLine();
				int id = sc.nextInt();
				Customer customer = new Customer(cus_name, id);
				bank.addCustomer(customer);
				break;
			case 2:
				bank.displayCustomers();
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("Wrong input");
			}
		}
		sc.close();
	}
}
