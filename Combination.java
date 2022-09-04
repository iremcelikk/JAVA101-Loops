import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, r;
		double result = 0.0, total1 = 1.0, total2 = 1.0;

		System.out.println("Enter the n number: ");
		n = sc.nextInt();
		System.out.println("Enter the n number: ");
		r = sc.nextInt();

		if (n > r) {
			if ((n - r) > r) {
				for (int i = n; i > (n - r); i--)
					total1 *= i;
				for (int i = r; i >= 1; i--)
					total2 *= i;
				result = total1 / total2;
				System.out.println("C(" + n + "," + r + ")= " + result);
			} else {
				for (int i = n; i > r; i--)
					total1 *= i;
				for (int i = (n - r); i >= 1; i--)
					total2 *= i;
				result = total1 / total2;
				System.out.println("C(" + n + "," + r + ")= " + result);
			}
		} else if (n == r) {
			result = 1;
			System.out.println("C(" + n + "," + r + ")= " + result);
		} else
			System.out.println("r can not greater than n !!!");

	}

}
