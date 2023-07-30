import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 1, input;
		double k = 1;
		System.out.println("enter number to calculate factorial");
		if (sc.hasNextInt()) {
			 input = sc.nextInt();
			while (i <= input) {
					k *= i;
					i++;
			}
			System.out.println("factorial of [" + input + "] is : " + k);

		} else {
			System.out.println("invalid input");
		}
	}

}
