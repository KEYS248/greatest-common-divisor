import java.util.Scanner;

public class GreatestCommonDivisor {
	public static int gcdIterative(int x, int y) {
		if (y > x) {
			int z = y;
			y = x;
			x = z;
		}
		while (x%y != 0) {
			int r = (x%y);
			x = y;
			y = r;
		}
		return y;
	}
	
	public static int gcdRecursion(int x, int y) {
		if (y > x) {
			int z = y;
			y = x;
			x = z;
		}
		if (y == 0) {
			return x;
		}
		return gcdRecursion(y, (x%y));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please give me the first number to Greatest Common Divisor for: ");
		int one = in.nextInt();
		System.out.println("Please give me the second number to Greatest Common Divisor for: ");
		int two = in.nextInt();
		System.out.println("Solution through iteration: " + gcdIterative(one, two));
		System.out.println("Solution through recursion: " + gcdRecursion(one, two));
		in.close();
	}

}
