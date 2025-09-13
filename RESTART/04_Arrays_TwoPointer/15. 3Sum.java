class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0;i<n-2;i++){
            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
