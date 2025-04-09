package doubly_linked_list;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Doubly_Linked_List list = new Doubly_Linked_List();

		boolean flag = true;
		while (flag) {
			System.out.println(
					"1. Insert Forward\n2. Insert Backward\n3. Display Forward\n4. Display Backward\n5. Display Count of nodes\n6. Update node\n7. Insert At\n8. Delete\n9. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter data: ");
				int data = sc.nextInt();
				list.insertFwd(data);
				break;
			case 2:
				System.out.println("Enter data: ");
				int data3 = sc.nextInt();
				list.insertBwd(data3);
				break;

			case 3:
				list.displayFwd();
				break;
			case 4:
				list.displayBwd();
				break;
			case 5:
				list.displayCount();
				break;
			case 6:
				System.out.println("Enter position and data");
				int pos6 = sc.nextInt();
				int data6 = sc.nextInt();
				list.updateNode(pos6, data6);
				break;
			case 7:
				System.out.println("Enter position and data: ");
				int pos7 = sc.nextInt();
				int data7 = sc.nextInt();
				list.insertAt(pos7, data7);
				break;
			case 8:
				System.out.println("Enter position");
				int pos8 = sc.nextInt();
				list.delete(pos8);
				break;
			case 9:
				flag = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

		sc.close();
	}
}
