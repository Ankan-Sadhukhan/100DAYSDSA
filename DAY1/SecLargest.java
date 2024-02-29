package DAY1;
import java.util.* ;
import java.io.*; 
public class SecLargest {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.

		int slargest=Integer.MIN_VALUE;
		int largest=arr[0];

		for(int i=1;i<n;i++){

			if(arr[i]>largest){
				slargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>slargest){

				slargest=arr[i];
			}

		}
		if(slargest==Integer.MIN_VALUE){
			return -1;
		}

		return slargest;
	}
}
