package DAY14;

import java.util.ArrayList;
import java.util.HashMap;

public class Checkpermutation {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        for(int i=0;i<str1.length();i++){
            if(map1.containsKey(str1.charAt(i))){
                int of = map1.get(str1.charAt(i));
                map1.put(str1.charAt(i), of+1);
            }else{
                map1.put(str1.charAt(i), 1);
            }
        }

        for(int i=0;i<str2.length();i++){
            if(map2.containsKey(str2.charAt(i))){
                int of = map2.get(str2.charAt(i));
                map2.put(str2.charAt(i), of+1);
            }else{
                map2.put(str2.charAt(i), 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>(map1.keySet());
        for(Character c:list){
            if(map1.get(c)!=map2.get(c)) return false;
        }
        
        return true;
    }
}