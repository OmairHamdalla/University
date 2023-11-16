import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        int a = num1; int b = num2;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
