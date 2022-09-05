import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username, password;
		int right = 3, select, balance = 1500, price;

		while (right > 0) {
			System.out.println("\nPlease enter your username:");
			username = sc.nextLine();
			System.out.println("Please enter your password:");
			password = sc.nextLine();
			if (username.equals("patika") && password.equals("java101")) {
				System.out.println("\nWelcome to \"Kodluyoruz\" bank.");

				do {
					System.out.println(
							"\nPlease select the operation: \n\t1-Balance:\t2-Withdraw Money:\t3-Deposit Money:\t4-Logout");
					select = sc.nextInt();
					switch (select) {
					case 1:
						System.out.println("\tBalance: " + balance);
						break;
					case 2:
						System.out.println("\tEnter the price:");
						price = sc.nextInt();
						if (price > balance)
							System.out.println("\tInsufficient Balance!!!");
						else {
							balance -= price;
							System.out.println("\tThe operation is successful.");
						}
						break;
					case 3:
						System.out.println("\tEnter the price:");
						price = sc.nextInt();
						balance += price;
						System.out.println("\tThe operation is successful.");
						break;
					case 4:
						System.out.println("\tWe hope you come again.");
					}
				} while (select != 4);

				break;

			} else {
				right--;
				if (right == 0)
					System.out.println("\nYour account is blocked. Please contact with the bank.");
				else
					System.out.println(
							"\nYour username or password is invalid! Try again.\nRemaining login right is: " + right);
			}
		}
	}
}
