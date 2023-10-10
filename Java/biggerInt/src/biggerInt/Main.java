package biggerInt;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 , n2 , n3 , max;
		
		System.out.print("Enter Your Value 1: ");
		n1 = input.nextInt();
		
		System.out.print("Enter Your Value 2: ");
		n2 = input.nextInt();
		
		System.out.print("Enter Your Value 3: ");
		n3 = input.nextInt();
		
		
        // Check if the number is greater than 5
//        if (n1 > n2) 
//        {
//        	if (n1 > n3) max = n1;
//        	else max = n3;
//      
//        } 
//        
//        else if (n2> n3) max = n2;   
//        else max = n3; 
		
		max = n1;
		
		if (max < n2) {
			max = n2;
		}
		if( max < n3){
			max =n3;
		}
        
        System.out.println("Max is: " + max);
	}

}
