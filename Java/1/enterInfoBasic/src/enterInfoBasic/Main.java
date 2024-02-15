package enterInfoBasic;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int by, age;
		
		
		System.out.print("Enter Your Name: ");
		name = input.nextLine();
		
		System.out.print("Enter Your Birth Year: ");
		by = input.nextInt();
		
		
		age = 2023 - by;
		System.out.println( name + "'s age is: " + age);
		
		
	}

}
