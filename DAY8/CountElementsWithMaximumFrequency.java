package DAY8;

import java.util.ArrayList;
import java.util.HashMap;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq = 1;
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int of = map.get(nums[i]);
                int nf = of+1;
                maxFreq = Math.max(maxFreq,nf);
                map.put(nums[i],nf);
            }else{
                map.put(nums[i],1);
            }
        }
        
        int ans =0;
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        
        for(int i:list){
            if(map.get(i)==maxFreq){
                ans +=maxFreq;
            }
        }
        
        return ans;
        
    }
}
