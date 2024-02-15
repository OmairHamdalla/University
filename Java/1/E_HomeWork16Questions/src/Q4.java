import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the Coefficient 1 value: ");
	    int num1 = input.nextInt();    
	    System.out.print("Enter the Coefficient 2 value: ");
	    int num2 = input.nextInt();
	    
	    int result = 0;
	    for (int i = 0; i < num2;i++){
	        result += num1;
	    }
	    
	    System.out.print("result is: " + result);


	}

}
