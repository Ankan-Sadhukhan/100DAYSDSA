class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int n=arr.length;
        
        int start =0,end=n-1;
        
        while(start<end){
            
            while(start < n && arr[start]%2==0 ){
                start++;
            }
            
            while(end >= 0 && arr[end] % 2 != 0 ){
                end--;
            }
            
            if(start < end){
                int temp= arr[start];
                arr[start] =arr[end];
                arr[end] = temp;
                // start++;
                // end--;
            }
            
        }
        
        Arrays.sort(arr,0,start);
        Arrays.sort(arr,start,n);
    }
}