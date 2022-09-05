import java.util.Scanner;

public class StarsDiamondShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a number:");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i == number) {
				for (int a = number - 1; a >= 1; a--) {
					for (int j = 1; j <= number - a; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= 2 * a - 1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}

}
