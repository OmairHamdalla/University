import java.util.Random;

public class Rounded_Student_List {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		String format = "%-5d %5d %5d %5d\n";
		System.out.format("%-5s %5s %5s %5s","Id" , "midterm" , "final" , "grade");
		System.out.println();

		
		for(int i = 1; i<=10;i++) {
			
			int midterms = (rand.nextInt(101)  % 10 ) * 10 ;
			int finals = (rand.nextInt(101)  % 10 ) * 10 ;
			
			int mid = (int) (0.4 * midterms);
			int fin = (int) (0.6 * finals) ;
			
			int grade = mid + fin;
			
//			System.out.format(format, i, mid,fin,grade);
			System.out.format(format, i, midterms,finals,grade);
		}

	}

}
