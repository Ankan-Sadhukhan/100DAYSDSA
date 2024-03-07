package DAY7;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> map = new HashMap<>();
		int maxi =0;
		int sum=0;
		for(int i=0;i<arr.size();i++){
			sum += arr.get(i);
			if(sum==0) maxi = i+1;
			if(map.containsKey(sum)){
				maxi = Math.max(maxi, i-map.get(sum));
			}else{
				map.put(sum,i);
			}
		}
		return maxi;
	}
}
