package DAY15;

import java.util.HashMap;

public class CountingSort {
    public static int[] sort(int n, int arr[]) {
		// Write your code here.
		int min = arr[0];
		int max = arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
			}
		}

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			if(map.containsKey(arr[i])){
				int of= map.get(arr[i]);
				map.put(arr[i],of+1);
			}else{
				map.put(arr[i],1);
			}
		}

	int idx=0;
		for(int i=min;i<=max;i++){
			if(map.containsKey(i)){
				int freq=map.get(i);
				while(freq>0){
					arr[idx]=i;
					idx++;
					freq--;
				}
			}
			
		}

		return arr;
	}
}
