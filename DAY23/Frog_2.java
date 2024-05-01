package DAY23;

import java.util.*;
public class Frog_2
{
    static long[] dp;
    
    public static long f(int k, int n,int[] arr){
        dp[1] = 0;
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i-j < 0) break;
                
                dp[i] = Math.min(dp[i],dp[i-j] + Math.abs(arr[i-j]-arr[i]));
            }
        }
        return dp[n];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int []arr = new int[n+1];
		dp = new long[100005];
		Arrays.fill(dp, Integer.MAX_VALUE);
		for(int i=1;i<=n;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println(f(k, n, arr));
	}
}

