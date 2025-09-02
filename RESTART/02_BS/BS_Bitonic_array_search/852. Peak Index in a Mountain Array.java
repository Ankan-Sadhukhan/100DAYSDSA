class Solution {
    public int check(int[] arr, int mid){
        if(mid == arr.length - 1) return 1;

        if(arr[mid]>arr[mid+1]){
            return 1;
        }else{
            return 0;
        }
    }
    public int peakIndexInMountainArray(int[] arr) {
        int ans= -1, left = 0,right =arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(check(arr,mid) == 1){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}