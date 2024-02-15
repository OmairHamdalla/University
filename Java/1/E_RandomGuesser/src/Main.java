import java.util.Random; 
import java.util.Scanner; 
public class Main { 
	public static void main(String[] args) {
		Random rand = new Random();
		int randomized ,inp = 0, division, modded,  divisionR, moddedR;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 01-99 to guess!");
		randomized = (rand.nextInt(109) - 10);
		for (int i = 0; i < 5; i++) {
			inp = scanner.nextInt();
			division = inp / 10; modded = inp % 10;
			divisionR = randomized / 10;
			moddedR = randomized % 10;
			if (moddedR == modded && division == divisionR) {
				System.out.println("You win!!"); break; }
			else if ( moddedR == division && divisionR == modded) 
				System.out.println("Same numbers with different placement!"); 
			else if ( moddedR == modded || division == divisionR) 
				System.out.println("-1 One number is correct"); 
			else if ( moddedR == division || divisionR == modded) 
				System.out.println("+1 One number is correct wrong placement"); 
			else System.out.println("000 TRY ANOTHER ONE!"); 
			System.out.println("You have " + ( 4 - i )+ " try left!\n");
			} 
		} 
	}