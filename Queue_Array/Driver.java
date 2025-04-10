package queue_array;

import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(5);
		boolean flag = true;
		while(flag) {
			System.out.println("1. Enqueue\n2. Dequeue\n3. Display Queue\n4. Is Queue Empty?\n5. Peek\n6. Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data: ");
				int data1 = sc.nextInt();
				q.enqueue(data1);
				break;
			case 2:
				int front_element = q.dequeue();
				if(front_element == Integer.MIN_VALUE)
					System.out.println("Queue is empty");
				else
					System.out.println(front_element);
				break;
			case 3:
				q.display();
				break;
			case 4:
				System.out.println(q.isEmpty());
				break;
			case 5:
				int peek_element = q.peek();
				if(peek_element == Integer.MIN_VALUE)
					System.out.println("Queue is empty");
				else
					System.out.println(peek_element);
				break;
			case 6:
				flag = false;
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}
