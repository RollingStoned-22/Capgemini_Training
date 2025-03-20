package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Initialise_2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column length: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter values: ");
		for(int i = 0;  i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] =  sc.nextInt();			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
