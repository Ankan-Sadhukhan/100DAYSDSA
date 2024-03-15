package DAY14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		ArrayList<Integer> ans =new ArrayList<>();
		int i=0;
		int j=0;
		while(i<n && j<m){
			if(arr1.get(i)==arr2.get(j)){
				ans.add(arr1.get(i));
				i++;
				j++;
			}else if(arr1.get(i)>arr2.get(j)){
				j++;
			}else{
				i++;
			}
		}

		 return ans;
       
	}
}
