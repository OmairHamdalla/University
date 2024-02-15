public class Q20 {

    public static int higherAvg(int[] nums) {
        int sum = 0;
        int counter = 0;
        
        for (int num : nums)
            sum += num;

        double average = (double) sum / nums.length;
        
        for (int num : nums)
            if (num > average)
                counter++;

        return counter;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int high = higherAvg(nums);
        System.out.println("Nums higher than average: " + high);
    }
}