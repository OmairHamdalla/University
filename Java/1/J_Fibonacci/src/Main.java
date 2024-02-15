
public class Main {
	
	public static boolean prime(int n) {
		boolean p = true;
		int half = n / 2;
		for(int i = 2; i < half; i ++) if (n % i == 0) p = false;
		return p;
	}
	
	public static void fibo( int n) {
		int [] list = new int[n];
		int counter = 0,firstTerm = 0, secondTerm = 1;
        
	    System.out.println("Fibonacci Series Upto " + n + ": ");
	    
	    while (firstTerm <= n) {
	      System.out.print(firstTerm + ", ");
	      
	      if (prime(firstTerm)){
	    	  list[counter] = firstTerm;
	    	  counter ++;
	      }

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	    }
	    System.out.println("\nPrime numbers: ");
	    for (int i = 0; i < n; i ++) {
	    	System.out.print(list[i]+ ", ");
	    	if (list[i+1]==0) break;
	    }
	
	}

	public static void main(String[] args) {
		fibo(100);
		

	}

}
