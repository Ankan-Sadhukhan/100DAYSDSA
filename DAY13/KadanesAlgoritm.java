package DAY13;

public class KadanesAlgoritm {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxSum=0;
		long sum=0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if(sum < 0){
				sum =0;
			}
			maxSum = Math.max(maxSum, sum);
		}

		return maxSum;
	}
}
