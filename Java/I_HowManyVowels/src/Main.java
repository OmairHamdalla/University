import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter Word: ");
	  String str = input.nextLine();
	  
	  char[] word = str.toCharArray();
	  int len = word.length;
	  char[] vowels = { 'a', 'i', 'e', 'o', 'u' };
	  int count = 0;

	  
	  for (int i = 0; i < (len - 1) ; i++)
		  for(int j =0; j <= 4; j++)
			  if (word[i] == vowels[j])
	  			count++;
			  

    System.out.println(count);

  }
}