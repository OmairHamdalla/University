import java.util.Scanner;

public class Q9{
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = n1 * 11;
		int n3 = (n2 * 10) + (n1);
		int result = n1 + n2 + n3;
		

		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + result);

	}
}
