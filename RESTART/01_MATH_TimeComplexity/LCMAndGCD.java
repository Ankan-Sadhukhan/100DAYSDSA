class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int LCM=a*b,GCD=1;
        
        
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                GCD = i;
                break;
            }
        }
        LCM = a*b/GCD;
        
        return new int[]{LCM,GCD};
    }
}