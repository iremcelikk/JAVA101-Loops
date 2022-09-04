import java.util.Scanner;
public class EvenNumbersDivisible4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=0, total=0;
		
		while(number%2==0) {
			System.out.println("Enter a number: ");
			number=sc.nextInt();
			if(number%4==0)
				total+=number;
		}
		System.out.println("Sum of even numbers divisible by 4: "+total);

	}

}
