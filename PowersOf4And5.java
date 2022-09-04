import java.util.Scanner;

public class PowersOf4And5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a number:");
		number = sc.nextInt();

		System.out.println("Powers of 4: ");
		for (int i = 1; i < number; i *= 4)
			System.out.print(i + " ");

		System.out.println("\nPowers of 5: ");
		for (int i = 1; i < number; i *= 5)
			System.out.print(i + " ");

	}

}
