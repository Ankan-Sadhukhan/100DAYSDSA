package DAY27;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    
    public static int[][] dp;
    
    public int f(List<List<Integer>> triangle,int i, int j, int m){
        if(i == m) return triangle.get(i).get(j);
        
        if(dp[i][j] != -1) return dp[i][j];
        
        return dp[i][j] = triangle.get(i).get(j) + Math.min(f(triangle,i+1,j,m), f(triangle,i+1,j+1,m));
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
       
        dp = new int[m][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        
        return f(triangle, 0, 0, m-1);
    }
}
