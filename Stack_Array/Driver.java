package stack_array;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Stack stack_obj = new Stack(2);
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1. Push\n2. Pop\n3. Display stack\n4. Peek\n5. Check stack\n6. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter data: ");
				int data1 = sc.nextInt();
				stack_obj.push(data1);
				break;
			case 2:
				int pop_element = stack_obj.pop();
				if (pop_element == Integer.MIN_VALUE)
					System.out.println("Stack is empty");
				else
					System.out.println(pop_element + "\t");
				break;
			case 3:
				if (stack_obj.top == -1)
					System.out.println("Stack is empty");
				int curr_size = stack_obj.top;
				for (int i = curr_size; i > -1; i--)
					System.out.print(stack_obj.arr[i] + "\t");
				System.out.println();
				break;
			case 4:
				int peek_element = stack_obj.peek();
				if (peek_element == Integer.MIN_VALUE)
					System.out.println("Stack is empty");
				else
					System.out.println(peek_element + "\t");
				break;
			case 5:
				if(stack_obj.isStackEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Stack is not empty");
				break;
			case 6:
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
