import java.util.Scanner;

public class QuadraticEq {
	double a;
	double b;
	double c;
	double root1;
	double root2;
	double det;
	
	QuadraticEq(){
		collectInfo();
		det = b * b - 4 * a * c ;
		calculate();
	}
	
	public void collectInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = input.nextInt();
		System.out.println("b: ");
		b = input.nextInt();
		System.out.println("c: ");
		c = input.nextInt();
	}
	
	public void calculate() {
		if (det > 0){
			root1 = ( -b + Math.sqrt(det)) / (2*a);
			root2 = ( -b - Math.sqrt(det)) / (2*a);}
		
		else if (det == 0) {
			root1 = root2 = -b / (2*a);}
		
		else {
			System.out.println("Complex numbers, Detirminent less than zero");
			root1 = root2 = 0;}
		
		display();
	}
	
	public void display() {
		System.out.printf("First root = %.4f | Second root = %.4f \n" ,root1, root2);
	}

}
