class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0, n=arr.length;
        for(int i=1;i<n-1;){
            if(arr[i] > arr[i+1] && arr[i]>arr[i-1]){
                int cnt = 1, j=i; //3
                while(j > 0 && arr[j] > arr[j-1]){ //left side mountaint
                    
                    cnt++; //1 2
                    j--; //2 1
                   
                }

                while(i<n-1 && arr[i] > arr[i+1]){//3
                    
                    cnt++; //3 4
                    i++; //4 5
                    
                }
                ans = Math.max(ans, cnt);
            }else{
                i++;
            }
        }
        return ans;
    }
}