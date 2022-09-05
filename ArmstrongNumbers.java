public class ArmstrongNumbers {
	public static void main(String[] args) {

		int tempNumber, digit, count, result = 1, sum;

		for (int number = 0; number <= 10000; number++) {

			tempNumber = number;
			count = 0;
			sum = 0;

			while (tempNumber != 0) {
				tempNumber /= 10;
				count++;
			}

			digit = count;
			tempNumber = number;

			while (tempNumber != 0) {
				result = 1;
				for (int i = 0; i < digit; i++) {
					result *= (tempNumber % 10);
				}
				sum += result;
				tempNumber /= 10;
			}

			if (sum == number)
				System.out.println(number + " is an armstrong number");
		}
	}
}
