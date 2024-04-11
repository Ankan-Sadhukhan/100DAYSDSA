package DAY12;

import java.util.* ;
import java.io.*; 
public class SelectionSort{
	public static int getMinIdx(int[] arr,int m,int n){
		int min = m;
		for(int i=m+1;i<n;i++){
			if(arr[i]<arr[min]){
				min = i;
			}
		}
		return min;
	}

	public static void swap(int[] arr, int i,int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<n;i++){
			int j = getMinIdx(arr,i,n);
			if(i != j){
				swap(arr,i,j);
			}
		}
	}
}