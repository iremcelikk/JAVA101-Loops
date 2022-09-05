import java.util.Scanner;

public class GreatestLowestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, gratest, lowest;

		System.out.println("Enter a number:");
		number = sc.nextInt();
		gratest = number;
		lowest = number;

		if (number >= 0) {
			while (number >= 0) {
				System.out.println("Enter a number:");
				number = sc.nextInt();

				if (number >= 0 && number > gratest)
					gratest = number;
				if (number >= 0 && number < lowest)
					lowest = number;
			}
			System.out.println(
					"The gratest and lowest numbers of the entered numbers are: " + lowest + " and " + gratest);
		} else
			System.out.println("Negative number entered!!!");
	}

}
