
public class Q8 {

	public static void duplicates(int[] array) {
        for (int i = 0; i < array.length; i++) 
            for (int j = i+1; j < array.length; j++) 
                if (array[i] == array[j]) { 
                    System.out.println("Duplicated number found, Its: " + array[i]); 
                    break; 
                }
     }

    public static void main(String[] args) {
        int[] numbers = {8,2,3,7,2,5,9,3};

        duplicates(numbers);
    }


}
