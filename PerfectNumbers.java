import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, sum = 0;

		System.out.println("Enter a positive number");
		number = sc.nextInt();

		if (number > 0) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sum += i;
					if (i == 1)
						System.out.print("1");
					else
						System.out.print(" + " + i);
				}
			}
			if (sum == number)
				System.out.println(" =" + sum + " is a perfect number.");
			else {
				System.out.println(" =" + sum + " != " + number + " is not a perfect number.");
			}
		} else {
			System.out.println("Negative number entered!!! ");
		}

	}
}