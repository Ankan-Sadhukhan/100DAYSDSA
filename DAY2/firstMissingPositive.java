package DAY2;

public class firstMissingPositive {
    
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
    
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            
            if(nums[i]>0 && nums[i]<=n){
                int idx = nums[i]-1;
                if(nums[idx] != nums[i]){
                    swap(nums,i,idx);
                    i--;
                }
            }  
        }
        
        for(int i=0;i<n;i++){
            if(nums[i] != i+1) return i+1;
        }
        
        return n+1;
    }
    
    public static void main(String[] args) {
        
    }
}
