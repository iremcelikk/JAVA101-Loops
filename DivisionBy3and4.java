import java.util.Scanner;

public class DivisionBy3and4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		double average, total = 0.0, counter = 0.0;

		System.out.println("Enter a number:");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				total += i;
				counter++;
				System.out.print(i + " ");
			}
		}

		average = total / counter;
		System.out.println("\nAverage: " + average);
		System.out.println("Total: " + total);
		System.out.println("Counter: " + counter);

	}

}
