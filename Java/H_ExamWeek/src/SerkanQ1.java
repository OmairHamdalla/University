import java.util.Scanner;

public class SerkanQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer less than 1000: ");
        int sayi = scanner.nextInt();

        if (sayi < 1000) {
            int i = 1;
            while (i * i <= sayi) {
                if (i * i == sayi) {
                    System.out.println(sayi + " is a square of " + i);
                    break;
                }
                i++;
            }
            if (i * i > sayi) {
                System.out.println(sayi + " is not a square of any number.");
            }
        } else {
            System.out.println("Sorry, try again. You wrote a number greater than 1000.");
        }

        scanner.close();
    }
}
