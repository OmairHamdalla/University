import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Word: ");
	    String str = input.nextLine();

    String reverse = "";
    
    int len = str.length();

    for (int i = (len - 1); i >=0; --i) 
    	reverse = reverse + str.charAt(i);

    if (str.equals(reverse))
    	System.out.println(str + " is a Palindrome String.");
    else
      System.out.println(str + " is not a Palindrome String.");

  }
}