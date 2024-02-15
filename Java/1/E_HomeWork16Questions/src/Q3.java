import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		    System.out.print("Enter the dividend value: ");
		    int dividend = input.nextInt();
		    
		    System.out.print("Enter the divisor value: ");
		    int divisor = input.nextInt();
		    
		    int temp = dividend;
		    int r=0,counter = 0;
		    
		    while(true){
		    	temp = temp-divisor;
		    	if(temp >= 0) {
		    		counter++;
		    		r=temp;
		    	}
		    	else break;
		    }
		    
		    System.out.printf("\n%d ÷ %d = \nQuotient: %d || Remainder: %d.",dividend,divisor,counter,r);
	}
}
