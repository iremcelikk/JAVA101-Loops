import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		double result = 0.0;

		System.out.println("Enter a number: ");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			result += (1.0 / i);
			if (i == 1)
				System.out.print("1");
			else
				System.out.print("+(1/" + i + ")");
		}
		System.out.print("=" + result);
	}

}
