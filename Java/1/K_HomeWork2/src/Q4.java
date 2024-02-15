import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static int[] removeElement(int[] array, int toRemove) {
        int index = -1;
        for (int i = 0; i < array.length; i++)
            if (array[i] == toRemove){
                index = i;
                break;}
        
        if (index != -1) {
        	  int newLength = array.length - 1;
        	  int[] newArr = new int[newLength];
        	  int j = 0;
        	  for (int i = 0; i < array.length; i++)
        	    if (array[i] != toRemove)
        	      newArr[j++] = array[i];
        	  return newArr;
        } else {
        	System.out.println("Not Found");
            return array;
        }
    }
    
    public static void main(String[] args) {
    	int[] numbers = {1, 5, 8, 3, 2, 9, 7};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int toRemove = scanner.nextInt();

        int[] numbers2 = removeElement(numbers, toRemove);
        System.out.println("Array After: " + Arrays.toString(numbers2));
    }

}
