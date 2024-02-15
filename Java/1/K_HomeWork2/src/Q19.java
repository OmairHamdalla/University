public class Q19 {

	public static void main(String[] args) {
		int [] nums = {6,4,7,8,9,5,1,2,1,3,6,4};
		int length = nums.length;
		System.out.println("Length of the original array: " + length);
		System.out.print("New length after removing check: " + check(nums,length));

	}
	
	public static int check(int nums[], int length) {
		int result = 0;
		for(int i = 0; i < length; i++) {
			boolean flag = false;
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j]) {
					flag = true;
					break;}
			}
			if(!flag)	nums[result++] = nums[i];
		}
		
		return result;
	}

}
