package DAY16;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        
        String[] components = path.split("/");
        
        for(String dir: components){
            if(dir.equals(".") || dir.isEmpty()){
                continue;
            }else if(dir.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(dir);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String dir: st){
            sb.append("/");
            sb.append(dir);
        }
        
        return sb.length()==0?  "/" : sb.toString();
    }
}
