import java.util.Scanner;

public class student {
	private String name;
	private int sno;
	private int cno;
	private int mid;
	private int fin;
	private double grade;
	
	public void collectInfo() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = input.nextLine();
		
		System.out.println("Mid: ");
		mid = input.nextInt();
		
		System.out.println("Fin: ");
		fin = input.nextInt();
		
		System.out.println("Student number: ");
		sno = input.nextInt();
		
		System.out.println("Course number: ");
		cno = input.nextInt();
	}
	
	public void calcGrade() {
		collectInfo();
		double newMid = 0.4 * mid;
		double newFin = 0.6 * fin;
		grade = newMid + newFin;
		printGrade();
	}
	
	public void printGrade() {
		System.out.println("Grade is: " + grade);
	}
	

}
