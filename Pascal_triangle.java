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

	// Task 2: Advanced Problems
	// Task 2.1: Implement drawPyramid(int n)
	// Cách 1: Dùng vòng lặp for
	public static void drawPyramid(int n) {
		// row
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// *
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
	// Cách 2: Dùng đệ quy

	public static void row(int i, int n) {
		if (i > n)
			return;
		space(1, n - i);
		star(0, 2 * i - 2);
		System.out.println();
		row(i + 1, n);
	}

	public static void space(int s1, int s2) {
		if (s1 > s2)
			return;
		System.out.print(" ");
		space(s1 + 1, s2);
	}

	public static void star(int st1, int st2) {
		if (st1 > st2)
			return;
		System.out.print("*");
		star(st1 + 1, st2);
	}

	// Task 2.3 (Optional): Implement drawChristmasTree(int n)
//	public static void drawChristmasTree(int n) {
////		if(n<1)return;
//
//
////		drawChristmasTree(n - 1);
//
//	}

	public static void main(String[] args) {
		int[] prevRow = { 1, 2, 1 };
		System.out.println(Arrays.toString(generateNextRow(prevRow)));
		System.out.println(Arrays.toString(getPascalTriangle(3)));
		printPascalTriangle(4);
		drawPyramid(5);
		row(1, 5);
//		drawChristmasTree(4);

	}
}
