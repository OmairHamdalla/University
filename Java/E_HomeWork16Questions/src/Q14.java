import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
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
