package DAY4;

import java.util.ArrayList;

public class DistributeElementsIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        int a =0;
        int b=0;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        a++;
        b++;
        for(int i=2;i<nums.length;i++){
            
            if(arr1.get(a-1)>arr2.get(b-1)){
                arr1.add(nums[i]);
                a++;
            }else{
                arr2.add(nums[i]);
                b++;
            }
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(i<a){
                nums[i]=arr1.get(i);
            }else{
                nums[i]=arr2.get(idx);
                idx++;
            }
            
        }
        
        
        return nums;

    }
}
