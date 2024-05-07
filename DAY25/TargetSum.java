package DAY25;

public class TargetSum {
    
        public int f(int[] nums, int n, int sum, int target){
            if(n == -1 && sum == target) return 1;
            if(n < 0) return 0;
            
            return f(nums, n-1, sum+nums[n], target) + f(nums, n-1, sum-nums[n], target);
        }
        
        public int findTargetSumWays(int[] nums, int target) {
            return f(nums, nums.length-1, 0, target);
        }
}
