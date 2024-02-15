//import java.util.Scanner;
//
//class Q2 {
//
//	public static void main(String[] args){
//	    Scanner input = new Scanner(System.in);
//	    System.out.print("Enter the numercial value to change it to binary: ");
//	    int num = input.nextInt();
//	    
//	    String binaryValue = Integer.toBinaryString(num);
//		System.out.print("Decimal: "+num + "\nBinary: "+binaryValue);
//	}
//}

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting an integer from the user
        System.out.print("Enter an integer: ");
        int decimalNumber = scanner.nextInt();

        // Converting the integer to binary
        String binaryRepresentation = convertToBinary(decimalNumber);

        System.out.println("Binary representation: " + binaryRepresentation);

        scanner.close();
    }

    private static String convertToBinary(int decimalNumber) {
        StringBuilder binaryBuilder = new StringBuilder();

        if (decimalNumber == 0) {
            binaryBuilder.append("0");
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryBuilder.insert(0, remainder); // Insert at the beginning
                decimalNumber /= 2;
            }
        }

        return binaryBuilder.toString();
    }
}
