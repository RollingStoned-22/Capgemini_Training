package one_to_many;

import java.util.Scanner;

public class PCDriver {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		
		boolean flag = true;
		PC pc = new PC("RollingStoned",size);
		while(flag) {
			System.out.println("1. Add Component\n2. Display all components\n3. Exit");
			System.out.println("Enter choice: ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter component name and its price: ");
				sc.nextLine();
				String component_name = sc.nextLine();
//				sc.nextLine();
				int price = sc.nextInt();
				Component component = new Component(component_name,price);
				pc.addComponent(component);
				break;
			case 2:
				pc.displayComponents();
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
		sc.close();
	}
}
