package lab2_recursion;

/*
Task 1.1: Using recursive approach to implement the following Algebra problems:
1. S(n)=1-2+3-4+…+ ((-1) (n+1) ).n , n>0
2. S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
3. S(n)=12+22+32+....+n2
, n>0
4. S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6...2n), n>=0
*/
public class Algebra_problems {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if (n == 1)
			return 1;

		return (int) (getSn1(n - 1) + (Math.pow(-1, n + 1)) * n);
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		if (n == 1)
			return 1;

		return factorial(n) + getSn2(n - 1);
	}

    //tính giai thừa
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1)
			return 1;
		return (int) (Math.pow(n, 2) + getSn3(n - 1));
	}

	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0

	// tính từng phần tử
	public static double getSn4(int n) {
		if (n == 0)
			return 1.0;

		return getSn4(n - 1) / (2 * n);

	}

    //tính tổng các phần tử S(n)
	public static double sumGetSn4(int n) {
		if (n == 0)
			return getSn4(n);
		return getSn4(n) + sumGetSn4(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(getSn1(5));
		System.out.println(getSn2(4));
		System.out.println(getSn3(3));
		System.out.println(sumGetSn4(3));

	}
}
