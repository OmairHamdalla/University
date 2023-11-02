import java.util.Random;
public class Double_Dice {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int counter = 0;
		
		System.out.println("n " + "dices " + "counter");
		
		for(int i = 1; i<=100;i++){
			
			int r = rand.nextInt(6) + 1;
			int r2 = rand.nextInt(6) + 1;
			
			if(r==6) if(r2==6) counter+= 1;
			
			System.out.println(i + "_ " + r + "  " + r2+ "  "  + counter);
		}
		
		System.out.println("Frequency: "+counter);

	}

}
