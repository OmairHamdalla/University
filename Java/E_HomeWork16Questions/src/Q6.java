import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary value: ");
        String bi1 = scanner.nextLine();
        System.out.println("Enter the second binary value: ");
        String bi2 = scanner.nextLine();

        int dec1 = Integer.parseInt(bi1, 2);
        int dec2 = Integer.parseInt(bi2, 2);
        int sumDecimal = dec1 + dec2;

        String sumBinary = Integer.toBinaryString(sumDecimal);

        System.out.println("\nThe sum of: " + bi1 + " + " + bi2 + " = " + sumBinary);
        System.out.println("Equivilant to: " + dec1 + " + " + dec2 + " = " + sumDecimal);
    }
}
