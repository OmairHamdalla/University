import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    	
        int[] numbers = {1, 5, 8, 3, 2, 9, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num to search: ");
        int targetValue = scanner.nextInt();
        
        int index = -1;
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
        	index++;
            if (numbers[i] == targetValue) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("The array contains the value " + targetValue + " At the index: " + index);
        else
            System.out.println("The array does not contain the value " + targetValue);

    }
}
