class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE, ans = target, n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];

                if(Math.abs(sum - target) < min){
                    min = Math.abs(sum - target);
                    ans = sum;
                }

                if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;

    }
}