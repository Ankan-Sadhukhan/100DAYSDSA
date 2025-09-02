/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findPeak(MountainArray mountainArr){
        int ans =-1, left=0,right=mountainArr.length()-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid == mountainArr.length()-1) return mid;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public int bs(MountainArray mountainArr, int left,int right,int target){
        int ans = -1;
         while(left<=right){
            int mid = left+(right-left)/2;
            if(target == mountainArr.get(mid)){
                ans = mid;
                right = mid-1;
            }
            if(mountainArr.get(mid) > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public int rbs(MountainArray mountainArr, int left,int right,int target){
        int ans = -1;
         while(left<=right){
            int mid = left+(right-left)/2;
            if(target == mountainArr.get(mid)){
                ans = mid;
            }
            if(mountainArr.get(mid) > target){
                left = mid+1;
                
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // if(mountainArr.length()==1 && mountainArr.get(0)==target){
        //     return 0;
        // }else if(mountainArr.length()==1 && mountainArr.get(0)!=target){
        //     return -1;
        // }
        int peak = findPeak(mountainArr);
        System.out.println(peak);

        int bs1 = bs(mountainArr,0, peak,target);
        int bs2 = rbs(mountainArr, peak+1, mountainArr.length()-1,target);

        if(bs1 != -1){
            return bs1;
        }
        return bs2;
        
    }
}