import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float radius;
		double pi = 3.14;
		double area;
		
		System.out.print("Enter radius: ");
		radius = input.nextFloat();
		
		area = radius * radius * pi;
		
		System.out.println(area);
		
		
	}

}
