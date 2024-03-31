package DAY17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> last_occ = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            last_occ.put(s.charAt(i),i);
        }
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            
            if(!seen.contains(c)){
                while(!st.isEmpty() && c < st.peek() && last_occ.get(st.peek())>i){
                    
                    seen.remove(st.pop());
                }
                st.push(c);
                seen.add(c);
            }
        }
        
        StringBuilder sb = new StringBuilder(st.size());
        for(Character c: st){
            sb.append(c);
        }
        return sb.toString();
    }
}
