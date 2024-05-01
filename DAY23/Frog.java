package DAY23;

import java.util.*;
public class Frog
{
    static long[] dp;
    
    public static long f(int i, int n,int[] arr){
        if(i>=n) return 0;
        if(i==n-1) return Math.abs(arr[i]-arr[n]);
        
        if(dp[i] != -1) return dp[i];
        
        return dp[i] = Math.min(f(i+1,n,arr) + Math.abs(arr[i+1]-arr[i]), f(i+2,n,arr) + Math.abs(arr[i+2]-arr[i]));
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n+1];
		dp = new long[100005];
		Arrays.fill(dp,-1);
		for(int i=1;i<=n;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println(f(1, n, arr));
	}
}
