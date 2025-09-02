class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,n= nums.length;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        int si = 0,ei = k, maxsum = sum;
        while(ei < n){
            sum -= nums[si];
            si++;

            sum += nums[ei];
            ei++;
            maxsum = Math.max(sum, maxsum);
        }
        return (double)maxsum/k;
    }
}