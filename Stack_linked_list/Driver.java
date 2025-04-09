package stack_linked_list;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Stack stack = new Stack();
		while(flag) {
			System.out.println("1. Push\n2. Pop\n3. Display stack\n4. Peek\n5. Check Stack status\n6. Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data: ");
				int data1 = sc.nextInt();
				stack.push(data1);
				break;
			case 2:
				int pop_data = stack.pop();
				if(pop_data == Integer.MIN_VALUE)
					System.out.println("Stack is empty");
				else
					System.out.println("Pop element: "+pop_data);
				break;
			case 3:
				stack.display();
				break;
			case 4:
				int peek_element = stack.peek();
				System.out.println("Peek element: "+peek_element);
				break;
			case 5:
				if(stack.isStackEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Stack is not empty");
				break;
			case 6:
				flag = false;
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid input");
			}
		}
		sc.close();
	}
}
