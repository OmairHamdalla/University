import java.util.Arrays;

public class Q10 {
	public static void sort(int[] array) {
    	for (int i = 0; i < array.length; i++) 
            for (int j = i+1; j < array.length; j++) 
                if (array[i] % 2 != 0) 
                	if(array[j] % 2 == 0) {
                		int temp = array[i];
                		array[i] = array[j];
                		array[j] = temp;
                	}
    	System.out.println(Arrays.toString(array));
	}

    public static void main(String[] args) {
        int[] numbers = {6,1,2,4,7,9,4,5};	        

        sort(numbers);
    }

}
