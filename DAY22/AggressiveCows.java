package DAY22;

import java.util.Arrays;

public class AggressiveCows {
    public static int check(int[] stalls,int mid,int k){

        int noofcows = 1;
        int pos = 0;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - stalls[pos] >= mid){
                pos =i;
                noofcows++;
            }

            if(noofcows == k) return 1;
        }
        return 0;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int high = stalls[stalls.length-1];
        int low = 0;
        

        int ans =0;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(check(stalls,mid,k)==1){
                ans =mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }
}
