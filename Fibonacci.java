import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat, n0 = 0, n1 = 1, temp;

		System.out.println("Enter the number of repetitions:");
		repeat = sc.nextInt();

		for (int i = 0; i < repeat; i++) {
			System.out.print(n1 + " ");
			temp = n1;
			n1 = n0 + n1;
			n0 = temp;
		}
	}

}
//Writes Fibonacci Sequence according to entered number