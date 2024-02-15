import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		int [] numbers = {42,75,54,89,84,27,30,19};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number for Search: ");
		int query = scanner.nextInt();
		boolean found = false;
		int index = 0;
		for (int i =0; i < numbers.length; i ++) {
			if (numbers[i] == query) {
				found = true;
				index = i;
				break;
			}
			
			
		}
		if (found) System.out.println("Result found in index: " + index);else System.out.println("Result Not found");

	}

}
