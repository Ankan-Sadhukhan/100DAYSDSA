package DAY15;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElementII {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                int of = map.get(arr.get(i));
                map.put(arr.get(i),of+1);
            }else{
                map.put(arr.get(i),1);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num)> arr.size()/3) ans.add(num);
        }

        return ans;

    }
}
