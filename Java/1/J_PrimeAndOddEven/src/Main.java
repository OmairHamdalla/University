
public class Main {
	
	static void oddEven(int n) {
		if (n%1 == 0) System.out.println("Its odd");
		else  System.out.println("Its even");
	}
	
	static boolean prime(int n) {
		boolean p = true;
		int half = n / 2;
		
		for(int i = 2; i < half; i ++) {
			if (n % i == 0) {
				p = false;
			}
		}	
		return p;
	}

	public static void main(String[] args) {
		System.out.println(prime(18));
		oddEven(4);

	}

}
