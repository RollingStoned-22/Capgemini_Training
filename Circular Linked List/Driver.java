package Circular_Linked_List;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularLinkedList list = new CircularLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println("1. Insert data\n2. Display data\n3. Update node\n4. Insert At\n5. Delete\n6. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter data: ");
				int data1 = sc.nextInt();
				list.insert(data1);
				break;
			case 2:
				list.display();
				break;
			case 3:
				System.out.println("Enter position and data: ");
				int pos2 = sc.nextInt();
				int data2 = sc.nextInt();
				list.update(pos2, data2);
				break;
			case 4:
				System.out.println("Enter position and data: ");
				int pos3 = sc.nextInt();
				int data3 = sc.nextInt();
				list.insertAt(pos3, data3);
				break;
			case 5:
				System.out.println("Enter position to be deleted: ");
				int pos5 = sc.nextInt();
				list.delete(pos5);
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
		sc.close();
	}
}
