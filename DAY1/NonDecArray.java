package DAY1;
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count =0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                if(count>0 || i>1 && i<nums.length-1 && nums[i-2] > nums[i] && nums[i-1]>nums[i+1]){
                    return false;
                }
                count++;
            }
        }

        
        
        
        return true;
    }
}