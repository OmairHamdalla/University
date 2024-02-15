import java.util.Random; 
import java.util.Scanner; 
public class Main {
	// int intArray[]; or int[] intArray;
		public static void main(String[] args) {
			
			Random rand = new Random();
			//Scanner input = new Scanner(System.in);
			int[] lotto = new int[5];
			int a;
			//creating unique random numbers without duplicates and storing them into array lotto
			for(int i = 0; i < 5; i++) 
			{
				a = rand.nextInt(10) + 1;
				boolean isDuplicate = false;
				
				for(int x = 0; x < i; x++) 
				{
					if(a == lotto[x]) 
					{
						isDuplicate = true;
						break;
					}
				}
				if(isDuplicate) 
				{
					i--;
				}
				else 
				{
					lotto[i] = a;
				}
			}
			for(int k = 0; k < 5; k++) 
			{
				System.out.print(lotto[k] + " ");
			}
			

		}

	}