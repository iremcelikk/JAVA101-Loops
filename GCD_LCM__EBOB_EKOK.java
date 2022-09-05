import java.util.Scanner;

public class GCD_LCM__EBOB_EKOK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, big, small, gcd = 0, lcm = 0;

		System.out.println("Enter the first number:");
		n1 = sc.nextInt();

		System.out.println("Enter the second number:");
		n2 = sc.nextInt();

		if (n1 > n2) {
			big = n1;
			small = n2;
		} else {
			big = n2;
			small = n1;
		}

		int i = small;
		while (i >= 1) {
			if (small % i == 0 && big % i == 0) {
				gcd = i;
				break;
			}
			i--;
		}
		System.out.println("GCD of " + small + " and " + big + " is ->" + gcd);

		i = 1;
		while (i <= small * big) {
			if (i % small == 0 && i % big == 0) {
				lcm = i;
				break;
			}
			i++;
		}
		System.out.println("GCD of " + small + " and " + big + " is ->" + lcm);
	}
}
