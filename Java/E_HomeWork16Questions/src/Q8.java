import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 digit number: ");
        
        int num = input.nextInt();
        int mid = (num / 100) % 10;

        System.out.println("The middle digit is: " + mid);
    }
}
