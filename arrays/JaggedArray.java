package day_8;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = createArray();
		System.out.println("The Matrix: ");
		Initialise_2DArray.printArray(arr);
	}
	
	public static int[][] createArray(){
		System.out.println("Enter no. of rows: ");
		int rows = sc.nextInt();
		int [][] jagged_arr = new int[rows][];
		int cols;
		for(int i = 0; i < rows; i++) {
			System.out.println("Enter number of elements in row"+(i+1)+": ");
			cols = sc.nextInt();
			jagged_arr[i] = new int[cols];
		}
		System.out.println("Enter values: ");
		for(int i = 0; i < jagged_arr.length; i++) {
			for(int j = 0; j < jagged_arr[i].length; j++) {
				jagged_arr[i][j] = sc.nextInt();
			}
		}
		return jagged_arr;
	}
}
