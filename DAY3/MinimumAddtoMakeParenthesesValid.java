package DAY3;

public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int op = 0;
        int count = 0;
        
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '(' ) {
                op++;
            }else if(s.charAt(i) == ')' && op ==0){
                count++;
            }else{
                op--;
            }
        }
        
        return count+op;
    }
}
