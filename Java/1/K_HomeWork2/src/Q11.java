
public class Q11 {
	
	public static void max(int[] arr) {
    	int max = 0;
    	for (int i = 0; i < arr.length; i++) 
            if(max<arr[i])
            	max = arr[i];
    	
    	System.out.println("Max = " + max);
   	    }

    public static void main(String[] args) {
        int[] arr1 = {11 , 57 , 81 , 64 , 13 , 74};	        
        max(arr1);
    }


}
