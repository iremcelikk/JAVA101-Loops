import java.util.Scanner;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pow, result = 1;

		System.out.println("Enter the number: ");
		num = sc.nextInt();

		System.out.println("Enter the pow: ");
		pow = sc.nextInt();

		for (int i = 0; i < pow; i++)
			result *= num;
		System.out.println(num + "^" + pow + "= " + result);
	}

}
