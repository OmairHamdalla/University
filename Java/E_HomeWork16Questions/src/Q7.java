import java.util.Scanner;

class Q7 {

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the Binary to change it to Decimal: ");
	    String biNum = input.nextLine();
	    
	    int decNum = Integer.parseInt(biNum, 2);
		System.out.print("Binary: "+biNum + "\nDecimal: "+decNum);
	}
}