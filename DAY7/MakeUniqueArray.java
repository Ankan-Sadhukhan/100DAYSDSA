package DAY7;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeUniqueArray {
    public static int minElementsToRemove(ArrayList<Integer> arr) {

		// Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
		int count =0;
		for(int i=0;i<arr.size();i++){
			if(map.containsKey(arr.get(i))) {
				count++;
			}else{
				map.put(arr.get(i),1);
			}
			
		}
		return count;
	}
}
