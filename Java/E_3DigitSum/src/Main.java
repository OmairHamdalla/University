import java.util.Random; 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("\t\tMethod1\nEnter the number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int z = number % 10;
		int x = number / 100;
		int y = (number - (x * 100) - z) / 10;
		int sum = x+y+z;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(sum);
		
		System.out.println("\n\n\t\tMethod2\nEnter the number:");
		int copyNum = number;
		int total;
		while(copyNum > 0) {
			total = copyNum % 10;
			copyNum = copyNum/ 10;
			
		}
			
	}

}
