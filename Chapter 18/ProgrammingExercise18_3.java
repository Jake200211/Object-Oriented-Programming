import java.util.Scanner;
class ProgrammingExercise18_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer 1: ");
		int m = input.nextInt();
		System.out.print("Enter integer 2: ");
		int n = input.nextInt();
		System.out.print("The Greatest Common Divisor is: " + gcd(m, n));
	}
	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		else {
			return gcd(n, m%n);
		}
	}
}