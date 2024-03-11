package DAY10;

public class PairSum {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int i=0;
        int j=n-1;
        int count =0;
        while(i<j){
            if(arr[i]+arr[j]==target) {
                count++;
                i++;
                j--;

            }else if(arr[i]+arr[j]>=target){
                j--;
            }else{
                i++;
            }
        }
        if(count ==0) return -1;
        return count;
        
    }
}
