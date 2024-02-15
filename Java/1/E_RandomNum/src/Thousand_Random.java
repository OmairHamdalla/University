import java.util.Random;

public class Thousand_Random {

	public static void main(String[] args) {
		Random rand = new Random();
		int eCounter = 0,dCounter = 0,cCounter = 0,bCounter = 0,aCounter = 0;
		
		System.out.println();
		
		for(int i = 1; i <= 1000; i++) {
			
			int midterms = (rand.nextInt(101)  % 10 ) * 10 ;
			int finals = (rand.nextInt(101)  % 10 ) * 10 ;
			
			int mid = (int) (0.4 * midterms);
			int fin = (int) (0.6 * finals);
			
			int grade = (int) mid + (int)fin;


		
			
			if (grade > 20) {
				if (grade >= 40) {
					if(grade >= 60) {
						if(grade>=80) {
							if (grade <= 100) {
								aCounter++;
							}
						}
						else
							bCounter++;
					}
					else 
						cCounter++;
				}
				else 
					dCounter++;
				
			}
			else 
				eCounter ++ ;
			
		}
		
		System.out.println("Frequency of 100 - 81: "+ aCounter + "\nFrequency of 80 - 61: "+ bCounter +"\nFrequency of 60 - 41: "+ cCounter +"\nFrequency of 40 - 21: "+ dCounter +"\nFrequency of 20 - 0: "+ eCounter );
	
	}

}
