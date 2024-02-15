import java.util.Arrays;
public class Q16 {

	public static void sortMerge(int nums[], int nums2[]) {
		int len1 = nums.length;
		int len2 = nums2.length;
		int array[] = new int[len1+len2];
		
		int i = 0;
		int j = 0;
		int counter = 0;
		
		while(i < len1) array[counter++] = nums[i++];
		
		while(j < len2) array[counter++] = nums2[j++];
		
		Arrays.sort(array);
		System.out.println("final array: " + Arrays.toString(array));
	}
	public static void main(String[] args) {
		int nums[] = {1,2,7,5,8,2};
		int nums2[] = {5,6,10,1,7,9};
		
		sortMerge(nums,nums2);
	}

}
