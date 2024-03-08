package DAY8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>, ArrayList<String>> bMap = new HashMap<>();

		for(String s:strs){
			HashMap<Character,Integer> map = new HashMap<>();
			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
				if(map.containsKey(c)){
					int of = map.get(c);
					map.put(c,of+1);
				}else{
					map.put(c,1);
				}
			}

			if(bMap.containsKey(map)){
                ArrayList<String> list = bMap.get(map);
				list.add(s);
				
			}else{
				ArrayList<String> list = new ArrayList<>();
				list.add(s);
				bMap.put(map,list);
			}
		}

		ArrayList<List<String>>ans = new ArrayList<>();

		for(ArrayList<String> val: bMap.values()){
			ans.add(val);
		}

		return ans;
    }
}
