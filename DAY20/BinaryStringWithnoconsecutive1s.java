package DAY20;
import java.util.*;

public class BinaryStringWithnoconsecutive1s {
    public static List< String > ans= new ArrayList<String>();

    public static void f(int n, String str, int i){

        if(i==n){
            ans.add(str);
            return;
        }

        if(i==0){
            f(n, str+"0",i+1);
            f(n, str+"1",i+1);
        }else if(str.charAt(i-1)=='1'){
            f(n, str+"0",i+1);
        }else{
            f(n, str+"0",i+1);
            f(n, str+"1",i+1);
        }
    return;
    }
    public static List< String > generateString(int N) {
        // Write your code here.
        f(N, "", 0);

        return ans;
    }
}
