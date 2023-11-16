import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int copyNum = number;
		int total=0;
		
		while(copyNum > 0 ) {
			total += copyNum % 10;
			copyNum = copyNum/ 10;
		}
		System.out.println(total);

	}

}
