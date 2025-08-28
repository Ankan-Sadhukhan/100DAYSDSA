class Solution {
    public boolean check(int[] nums, int k, int mid){
        int n = nums.length, i=0, j=1,ans =0;
        while(i<n || j<n){
            while(j<n && nums[j]-nums[i] <= mid){
                j++;
            }
            ans += j-i-1;
            i++;
        }
        return ans >= k;

    }

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums[nums.length-1] - nums[0];

        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;

            if(check(nums,k,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}