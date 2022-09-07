import java.util.Scanner;

public class StarsInvertedTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a number:");
		number = sc.nextInt();

		for (int i = number; i > 0; i--) {
			for (int j = 0; j < number - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
