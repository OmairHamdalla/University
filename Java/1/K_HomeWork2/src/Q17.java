import java.util.Arrays;

public class Q17 {

    public static double median(int[] nums) {
        Arrays.sort( nums); 
        int len = nums.length;

        int middleIndex = len / 2 ;
        if (len % 2 == 0)
            return (nums[middleIndex - 1 ] + nums[middleIndex]) / 2 ;
        else
            return nums[middleIndex];
    }

    public static void main(String[] args) {
        int[] nums = {5,8,6,4,5,1,2};
        double median = median(nums);
        System.out.println("Median is: " + median);
    }
}
