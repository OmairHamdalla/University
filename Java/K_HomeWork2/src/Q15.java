public class Q15 {

	public static void main(String[] args) {
		int nums1[] = {7, 3, 8, 4};
		int nums2[] = {4, 1, 2, 9};
		
		int array[] = new int[nums1.length];
		
		for(int i = 0; i < nums1.length; i++)
			array[i] = nums1[i] * nums2[i];
		
		System.out.println("Array is :");
		
		for(int j = 0; j < nums1.length; j++)
			System.out.print(array[j] + ", ");
	}

}
