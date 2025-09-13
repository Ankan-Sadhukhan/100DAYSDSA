class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = -1,right =-1, n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i] < 0){
                left =i;
            }
            if(nums[i] >=0){
                right = i;
                break;
            }
        }

        int[] ans = new int[n];
        int idx = 0;
        while(left >= 0 && right < n && right >=0){
            if(nums[left] * nums[left] <= nums[right] * nums[right]){
                ans[idx] = nums[left] * nums[left];
                idx++;
                left--;
            }else{
                ans[idx] = nums[right] * nums[right];
                idx++;
                right++;
            
            }
        }
        while(left >=0){
            ans[idx] = nums[left] * nums[left];
            idx++;
            left--;
        }

        while(right < n && right >=0){
            ans[idx] = nums[right] * nums[right];
            idx++;
            right++;
        }

        return ans;
    }
}