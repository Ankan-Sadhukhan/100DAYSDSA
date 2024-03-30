package DAY16;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
    
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' ||c=='{' ||c=='['){
                st.push(c);
            }else{
                if(!st.isEmpty()){ //put this check to avoid empty stack exception
                    if(c==')' && st.peek()=='('){
                        st.pop();
                    }else if(c=='}' && st.peek()=='{'){
                        st.pop();
                    }else if(c==']' && st.peek()=='['){
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
            
        }
        
        return st.isEmpty();
    }
}
