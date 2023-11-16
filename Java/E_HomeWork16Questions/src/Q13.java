import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int end = scanner.nextInt();

        int count = 0; 
        long sum = 0;   

        for (int number = Math.max(2, start); number <= end; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of prime numbers between " + start + " and " + end + ": " + average);
        } else {
            System.out.println("No prime numbers found between " + start + " and " + end);
        }

        scanner.close();
    }
}
