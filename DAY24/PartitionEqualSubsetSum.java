package DAY24;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    
    public static int dp[][];
    
    public boolean f(int[] nums,int csum, int n, int sum){
        
        if(csum == sum) return true;
        if(n<0) return false;
        
        if(dp[n][csum] != -1) return dp[n][csum] == 0 ? false : true;
        
        boolean a1 = false;
        if(csum + nums[n] <= sum){
            a1= f(nums, csum+nums[n],n-1,sum);
        }
        
        boolean a2 = f(nums,csum,n-1,sum);
        
        dp[n][csum] = a1 || a2 ? 1:0;
        
        return a1 || a2;
    }
    
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        if(sum %2 != 0) return false;
        
        dp = new int[n+5][sum/2 +5];
        
        for(int row[] :dp){
            Arrays.fill(row,-1);
        }
        
        boolean ans = f(nums,0,n-1,sum/2);
        
        return ans;
    }
}

