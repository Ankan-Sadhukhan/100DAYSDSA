package DAY9;

import java.util.Arrays;

public class AppleRedistributionintoBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total =0;
        for(int i=0;i<apple.length;i++){
            total += apple[i];
        }
        
        Arrays.sort(capacity);
        
        int cnt =0;
        int sum=0;
        
        for(int i=capacity.length-1;i>=0;i--){
            cnt++;
            sum += capacity[i];
            //System.out.println(cnt+","+sum+","+total);
            if(sum>=total) return cnt;
        }
        
        return capacity.length;
    }
}
