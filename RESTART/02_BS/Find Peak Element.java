class Solution {
    public int check(int[] nums, int mid){
        if(mid >= nums.length-1) return 1;
        if(nums[mid]> nums[mid+1]){
            return 1;
        }

        return 0;
    }
    public int findPeakElement(int[] nums) {
        int ans = nums.length-1;

        int left =0,right = nums.length-1;

        while(left <= right){

            int mid = left + (right-left)/2;
            if(check(nums,mid)==1){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}