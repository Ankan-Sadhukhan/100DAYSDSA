package DAY7;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str) {

		// Write your code here
		HashMap<Character,Integer> fmap = new HashMap<>();

		for(int i=0;i<str.length();i++){
			if(fmap.containsKey(str.charAt(i))){
				int of = fmap.get(str.charAt(i));
				fmap.put(str.charAt(i),of+1);
			}else{
				fmap.put(str.charAt(i),1);
			}
		}

		for(int i=0;i<str.length();i++){
			if(fmap.get(str.charAt(i))==1) return str.charAt(i);
		}

		return str.charAt(0);
	}
}
