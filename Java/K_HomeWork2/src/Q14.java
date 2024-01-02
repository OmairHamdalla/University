public class Q14 {

   public static boolean canPartitionKSubsets(int[] nums, int k) {
       int totalSum = 0;
       for (int num : nums)
           totalSum += num;

       if (totalSum % k != 0)
           return false;

       int target = totalSum / k;
       boolean[] visited = new boolean[nums.length];
       return canBePartition(nums, visited, 0 , 0 , target , k);
   }

   private static boolean canBePartition(int[] nums, boolean[] visited, int currentSum, int currentSet, int target, int k) {
       if (k == 1)
           return true;

       if (currentSum == target)
           return canBePartition(nums, visited, 0, currentSet + 1, target, k - 1); 

       for (int i = 0; i < nums.length; i++)
           if (!visited[i] && currentSum + nums[i] <= target) {
               visited[i] = true;
               if ( canBePartition(nums, visited, currentSum + nums[i], currentSet, target, k) )
                   return true;

               visited[i] = false;  // Backtrack
           }

       return false;
   }
}
