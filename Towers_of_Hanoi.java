package recursion;

public class Towers_of_Hanoi {
	static char[] c = { 'A', 'B', 'C' };

	public static void Towers(int disk, int source, int dest, int spare) {
		if (disk == 1) {
			System.out.println("Chuyển dia " + disk + " tu cot " + c[source] + " sang cot " + c[dest]);

		} else {
			Towers(disk - 1, source, spare, dest);
			System.out.println("Chuyển dia " + disk + " tu cot " + c[source] + " sang cot " + c[dest]);
			Towers(disk - 1, spare, dest, source);
		}

	}

	public static void main(String[] args) {
		Towers(3, 0, 2,1);
	}
}
