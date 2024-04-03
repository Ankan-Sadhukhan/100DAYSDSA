package DAY19;

import java.util.ArrayList;
import java.util.Arrays;

public class SumofTwoElementsEqualsThird {
    public static  ArrayList<Integer> findTriplets(int[] arr, int n) 
    {
	    //Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		Arrays.sort(arr);
		if(arr.length<3)return ans;


		for (int i = n - 1; i >= 0; i--) { 
            int j = 0; 
            int k = i - 1; 
            while (j < k) { 
                if (arr[i] == arr[j] + arr[k]) { 
  
                    ans.add(arr[i]);
					ans.add(arr[j]);
					ans.add(arr[k]);
					return ans;
                } 
                else if (arr[i] > arr[j] + arr[k]) 
                    j += 1; 
                else
                    k -= 1; 
            } 
        } 

		return ans;
	}
}
