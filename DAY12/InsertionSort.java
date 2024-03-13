package DAY12;

public class InsertionSort {
    public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		for(int i=1;i<n;i++){
			int currElement = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>currElement){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=currElement;
		}
	}
}
