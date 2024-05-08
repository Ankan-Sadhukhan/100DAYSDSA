package DAY27;

import java.util.Arrays;

public class UniquePathsII {
    public static int[][] dp;
    
    public int f(int[][] obstacleGrid, int m, int n){
        if(m<0 || n<0 || obstacleGrid[m][n] == 1) return 0;
        if(m==0 && n==0) return 1;      
        
        if(dp[m][n] != -1) return dp[m][n];
        
        return dp[m][n] =  f(obstacleGrid, m-1,n) + f(obstacleGrid,m, n-1);
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        
        return f(obstacleGrid, m-1, n-1);
    }
}
