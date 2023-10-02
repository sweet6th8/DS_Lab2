package lab2_recursion;

public class Pyramid {
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

	public static void main(String[] args) {
		drawPyramid(5);
		row(1, 5);
	}
}
