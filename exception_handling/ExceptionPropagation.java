package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPropagation {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter 2 integers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
			int[] arr = {1,2,3,4,5};
			System.out.println("Enter index to be accessed: ");
			int index = sc.nextInt();
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException handled");
		}
//		catch(ArithmeticException e) {
//			System.out.println("ArithmeticException handled");
//		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
