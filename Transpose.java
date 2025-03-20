package day8;

import java.util.Scanner;

public class Transpose {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = Initialise_2DArray.createArray();
		if (Check_Symmetry.isSquare(arr)) {
			int[][] transpose_arr = getTranspose(arr);
			Initialise_2DArray.printArray(transpose_arr);
		}
	}

	public static int[][] getTranspose(int[][] arr) {
		int[][] transpose_arr = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				transpose_arr[j][i] = arr[i][j];
			}
		}
		return transpose_arr;
	}
}
