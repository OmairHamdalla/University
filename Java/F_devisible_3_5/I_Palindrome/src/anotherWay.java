import java.util.Scanner;

public class anotherWay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Word: ");
	    String str = input.nextLine();
	    
	    char[] word = str.toCharArray();
	    boolean flag = false;
	    
	    int len = str.length();

	    for (int i = 0; i < (len - 1); i++) {
	    	if(word[i] != word[len-i-1]) {
	    		flag = true;
	    		break;
	    	}
	    }

	    if (!flag)
	    	System.out.println(str + " is a Palindrome String.");
	    else
	      System.out.println(str + " is not a Palindrome String.");

	  }

}
