package lab2_recursion;

import java.util.Arrays;

public class Pascal_triangle {
	// This method is used to display a Pascal triangle based
	// on the parameter n.
	// Where n represents the number of rows

	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			System.out.println(Arrays.toString(getPascalTriangle(i)));
		}
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {

		if (n == 1)
			return new int[] { 1 };
		return generateNextRow(getPascalTriangle(n - 1));
	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int[] result = new int[prevRow.length + 1];
		result[0] = 1;
		result[result.length - 1] = 1;

		for (int i = 1; i < result.length - 1; i++) {
			result[i] = prevRow[i - 1] + prevRow[i];
		}
		return result;
	}



	public static void main(String[] args) {
		int[] prevRow = { 1, 2, 1 };
		System.out.println(Arrays.toString(generateNextRow(prevRow)));
		System.out.println(Arrays.toString(getPascalTriangle(3)));
		printPascalTriangle(4);
		

	}
}
