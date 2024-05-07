package DAY25;
import java.util.Arrays;

public class  UniquePaths {
        public static int[][] dp;
        
        public int f(int m,int n){
            
            if(m==0 && n==0) return 1;
            if(m<0 || n<0) return 0;
            
            if(dp[m][n] != -1) return dp[m][n];
            
            int up = f(m-1,n);
            int left = f(m,n-1);
            return dp[m][n] = up + left;
        }
        
        public int uniquePaths(int m, int n) {
            dp = new int[m][n];
            
            for(int[] row: dp){
                Arrays.fill(row, -1);
            }
            return f(m-1,n-1);
        }
    
}
