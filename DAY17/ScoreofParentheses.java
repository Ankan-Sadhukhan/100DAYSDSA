package DAY17;

import java.util.Stack;

public class ScoreofParentheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                st.push(-1);
            }else{
                if(st.peek()== -1){
                    st.pop();
                    st.push(1);
                }else{
                    int sum=0;
                    while(st.peek() != -1){
                        sum += st.pop();
                    }
                    st.pop();
                    st.push(2*sum);
                }
            }
        }
        int sum=0;
        while(st.size() > 0){
            sum += st.pop();
        }
        
        
        return sum;
    }
}
