package day_8;

import java.util.Scanner;

public class FindMax {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = Initialise_2DArray.createArray();
		int maxElement = findMax(arr);
		System.out.println(maxElement);
	}

	public static int findMax(int[][] arr) {
		int maxElement = arr[0][0];
		for (int row[] : arr) {
			for (int num : row) {
				maxElement = (num > maxElement) ? num : maxElement;
			}
		}
		return maxElement;
	}
}
