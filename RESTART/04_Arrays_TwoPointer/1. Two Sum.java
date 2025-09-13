class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums); //nlohn
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i < nums.length;i++){
            int el = target - nums[i];
            if(map.containsKey(el)){
                int j = map.get(el);
                if(i != j){
                    return new int[]{i,j};
                }
                
            }
        }

        return new int[]{-1,-1};

        // int left = 0, right = nums.length-1;
        // while(left < right){
        //     if(nums[left]+nums[right] == target){
        //         return new int[]{left,right};
        //     }else if(nums[left]+nums[right] < target){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return new int[]{left,right};
    }
}