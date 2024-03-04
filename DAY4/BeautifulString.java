package DAY4;

public class BeautifulString {
    public static String generate(int n, boolean b){
        String ans = "";
        if(n ==0) return ans;
        
        if(b){
            ans += '1';
            n--;
        }else{
            ans += '0';
            n--;
        }

        while(n>=0){
            if(ans.charAt(ans.length()-1) == '0'){
                ans += '1';
            }else{
                ans += '0';
            }
            n--;
        }
        return ans;
    }

    public static int diff(String s, String org,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) != org.charAt(i)) ans++;
        }

        return ans;
    }
    
    public static int makeBeautiful(String s) {

         int n = s.length();
        String g1 = generate(n,true);
        int diff1 = diff(g1,s,n);

        String g2 = generate(n,false);
        int diff2 = diff(g2,s,n);

        return Math.min(diff1,diff2);
    }
}
