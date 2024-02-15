
public class Q9 {
	
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
    
    
	public static void equalitiy(int[] arr1, int[] arr2) {
    	boolean flag = true;
        for (int i = 0; i < arr1.length; i++) 
                if (arr1[i] != arr2[i]) { 
                    System.out.println("Not equal "); 
                    flag = false;
                    break; 
                }
        if(flag) System.out.println("Equal");
   	    }
    


    public static void main(String[] args) {
        int[] nums = {9,8,5,7,1};
        int[] nums2 = {1,5,8,7,9};
        
        sort(nums);
        sort(nums2);

        equalitiy(nums, nums2);
    }


}
