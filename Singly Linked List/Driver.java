package singly_linked_list;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"1. Insert Data\n2. Display data\n3. Display Number of nodes\n4. Update Node\n5. Insert Node in between\n6. Delete Node\n7. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter data: ");
				int data = sc.nextInt();
				list.insert(data);
				break;
			case 2:
				list.display();
				break;
			case 3:
				list.displayCount();
				break;
			case 4:
				System.out.println("Enter position and data: ");
				int pos4 = sc.nextInt();
				int newData4 = sc.nextInt();
				list.updateNode(pos4, newData4);
				break;
			case 5:
				System.out.println("Enter position and data: ");
				int pos5 = sc.nextInt();
				int newData5 = sc.nextInt();
				list.insertNodeInBetween(pos5, newData5);
				break;
			case 6:
				System.out.println("Enter node position to be deleted: ");
				int pos6 = sc.nextInt();
				list.delete(pos6);
				break;
			case 7:
				System.out.println("Thank You!");
				flag = false;
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
		sc.close();
	}
}
