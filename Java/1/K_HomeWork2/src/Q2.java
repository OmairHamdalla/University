import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    	
        int[] numbers = {1, 5, 8, 3, 2, 9, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int targetValue = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("The array contains the value " + targetValue);
        else
            System.out.println("The array does not contain the value " + targetValue);

    }
}
