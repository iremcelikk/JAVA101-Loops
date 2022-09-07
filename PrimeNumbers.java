import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPrimeNumber;

		for (int i = 2; i <= 100; i++) {
			isPrimeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isPrimeNumber = false;
			}
			if (isPrimeNumber)
				System.out.print(i + " ");
		}
	}
}
