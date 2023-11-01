import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double r = 0.02;
		int p;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the current population");
		p = input.nextInt();
		System.out.println("enter the growing rate");
		r = input.nextDouble();
		System.out.println("enter how many years you want to calculate");
		y = input.nextInt();

		
		double temp;
		for (int i = 1; i <=y; i++) {
			temp = p * r;
			p += temp;			
		}
		
		System.out.println(p);

	}

}
