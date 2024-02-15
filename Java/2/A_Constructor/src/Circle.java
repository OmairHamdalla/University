import java.util.Scanner;

public class Circle {
	
	private int r;
	private double area;
	private double circumfrence;
	
	public Circle() {
		collectInfo();
		calcArea();
		calcCircumfrence();
		display();
	}
	
	public void collectInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the r: ");
		r = input.nextInt();
		input.close();

	}

	public void calcArea() {
		area = r * r * 3.14;
	}
	
	public void calcCircumfrence() {
		circumfrence = r * 2 * 3.14;
	}
	
	public void display() {
		System.out.println("Area is: " + area);
		System.out.println("Circumfrence is: " + circumfrence);
	}

}
