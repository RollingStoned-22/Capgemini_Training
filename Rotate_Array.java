package day8;

import java.util.Scanner;

public class Rotate_Array {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = Initialise_2DArray.createArray();
		if (Check_Symmetry.isSquare(arr)) {
			System.out.println("Rotated Array");
			int[][] rot_array = getRotatedArray(arr);
			Initialise_2DArray.printArray(rot_array);
		}
	}

	public static int[][] getRotatedArray(int[][] arr) {
		int temp = 0;
		arr = Transpose.getTranspose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length / 2; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[i][arr[i].length - j - 1];
				arr[i][arr[i].length - j - 1] = temp;
			}
		}

		return arr;
	}
}
