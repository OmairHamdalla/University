import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int result = 0;
		int rem;
		
		while(number != 0) {
			rem = number % 10;
			result = result * 10 + rem;
			number /= 10;
		}
		
		System.out.println(result);
		
		
			
	}

}
