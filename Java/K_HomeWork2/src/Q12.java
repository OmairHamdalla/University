
public class Q12 {
	public static void higherAvg(int[] array) {
    	int sum = 0;
    	
    	for (int i = 0; i < array.length; i++) 
            sum+=array[i];
    	int avg = sum/array.length;
    	
    	System.out.println("average: "+ avg);
    	System.out.println("nums higher than average: ");
    	for(int i: array) if(i>avg) System.out.print(i + " , ");
   	    }

    public static void main(String[] args) {
        int[] numbers = {77 , 54 , 62 , 31 , 24 , 46};	        

        higherAvg(numbers);
    }


}
