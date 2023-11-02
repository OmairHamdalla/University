import java.util.Random;

public class Faster_Car {

	public static void main(String[] args) {
		Random rand = new Random();
		int b = 0,v = 0,a = 0,f = 0,t = 0;
		
		System.out.println();
		
		for(int i = 1; i <= 1000; i++) {
			
			int toyota = (rand.nextInt(201)  % 10 ) * 10 ;
			int fiat = (rand.nextInt(201)  % 10 ) * 10 ;
			int audi = (rand.nextInt(201)  % 10 ) * 10 ;
			int volks = (rand.nextInt(201)  % 10 ) * 10 ;
			int bmw = (rand.nextInt(201)  % 10 ) * 10 ;
			
					int max = toyota;
					if (fiat > max) max = fiat;
					if (audi > max) max = audi;
					if (volks > max) max = volks;
					if (bmw > max) max = bmw;
					
			
			switch (max){
			
			case toyota:
				t++;
				break;
				
			case fiat:
				f++;
				break;
				
			case audi:
				a++;
				break;
				
			case volks:
				v++;
				break;
				
			case bmw:
				b++;
				break;
			
			
			}
			
			
			
		}
		
		System.out.println("Frequency of audi: "+ a + "\nFrequency of fiat: "+ f +"\nFrequency of toyota: "+ t +"\nFrequency of volks: "+ v +"\nFrequency of bmw: "+ b );
	
	}

}
