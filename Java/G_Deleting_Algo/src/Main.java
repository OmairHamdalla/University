import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int[] arr = {1 , 2 , 3 , 4 , 5 , 6};
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the dividend value: ");
	    int toDelete = input.nextInt();
		
	    for(int i= 0; i<arr.length;i++) {
	    	if(i == toDelete) {
	    }
		
		
		
		System.out.println("Result: ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		
	}
}
