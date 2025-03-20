package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Initialise_2DArray {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = createArray();
		printArray(arr);
	}

	public static int[][] createArray() {
		System.out.println("Enter row and column length: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter values: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	public static void printArray(int[][] arr) {
//		To print the 2D array in a single line
//		System.out.println(Arrays.deepToString(arr));

//		To print the 2D array using toString()
//		for(int i = 0; i < arr.length; i++)
//			System.out.println(Arrays.toString(arr[i]));

		/// Using for each loop

		for (int row[] : arr) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
