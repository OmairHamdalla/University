import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static int[] addElement(int[] array, int toAdd, int index) {        
        if (index >= -1 && index < array.length) {
        	  int newLength = array.length + 1;
        	  int[] newArr = new int[newLength];
        	  boolean flag = false;
        	  for (int i = 0; i < newLength; i++) {
        		  if (i == index) {
        			  newArr[i] = toAdd;
        			  flag = true;}
        		  else if (!flag) newArr[i] = array[i];
        		  else if (flag) newArr[i] = array[i-1];        		  
        	  }
        	  return newArr;	  
        } else {
        	System.out.println("Invalid");
            return array;}
    }
    

    public static void main(String[] args) {
    	int[] numbers = {1, 5, 8, 3, 2, 9, 7};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num to add: ");
        int toAdd = scanner.nextInt();
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        int[] numbers2 = addElement(numbers, toAdd, index);
        System.out.println("Array After: " + Arrays.toString(numbers2));
    }

    
}
