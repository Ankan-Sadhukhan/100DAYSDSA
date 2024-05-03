package DAY24;

import java.util.Arrays;

public class Countwaytoreachnthstair {
    static int[] dp;
    
    public static int f(int c, int n){

		if(c==n) return 1;
		if(c > n) return 0;

		if(dp[c] != -1) return dp[c];

		return dp[c] = f(c+1,n) + f(c+2, n);
	}
    
    public int climbStairs(int n) {
        dp = new int[100005];
        Arrays.fill(dp,-1);

		int ans = f(0,n);
		return ans;
    }
}

