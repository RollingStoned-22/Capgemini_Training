package day_8;

import java.util.Scanner;

public class Check_Symmetry {

	Scanner sc = new Scanner(System.in);

	public static boolean isSquare(int[][] arr) {
		boolean ans = (arr.length == arr[0].length) ? true : false;
		return ans;
	}

	public static boolean checkSymmetry(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] arr = Initialise_2DArray.createArray();
		if (isSquare(arr)) {
			boolean isSymmetric = checkSymmetry(arr);
			System.out.println(isSymmetric);
		} else
			System.out.println("Not a Square Matrix");
	}
}

