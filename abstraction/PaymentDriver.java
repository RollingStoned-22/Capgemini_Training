package abstraction;

import java.util.Scanner;

public class PaymentDriver {
	public static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter payment method: ");
			System.out.println("1. Credit Card\n2. PayPal");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: 
				Payment cc = new CreditCard(600,337);
				cc.processPayment();
				break;
			case 2:
				Payment pp = new PayPal(300,572);
				pp.processPayment();
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
}
