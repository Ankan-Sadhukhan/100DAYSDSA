class Solution {
    public boolean check(int[] nums, int k, int mid){
        int cnt =0, i=0;
        int n = nums.length;
        while(i<n){
            int s = 0;
            if(nums[i]>mid)return false;
            while(i<n && (s + nums[i])<=mid){
                s += nums[i];
                i++;
            }
            
            cnt++;
        }
        return cnt <=k;
    }
    public int shipWithinDays(int[] nums, int k) {
        int ans =-1,left = 0, right =0,n = nums.length;
        for(int i=0;i<n;i++){
            right += nums[i];
        }

        while(left <= right){
            int mid = left + (right-left)/2;
            System.out.println(ans);
            if(check(nums, k, mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}