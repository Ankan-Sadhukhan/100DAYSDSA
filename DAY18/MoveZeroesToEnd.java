package DAY18;

import java.util.ArrayList;

public class MoveZeroesToEnd {
    public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		// Write your code here.
		int cnt = 0;
		int idx = 0;
		int n = arr.size();

		for(int i=0;i<n;i++){
			if(arr.get(i)==0){
				cnt++;
			}else{
				arr.set(idx, arr.get(i));
				idx++;
			}
		}

		while(cnt>0){
			arr.set(n-cnt, 0);
			cnt--;
		}
		
	}
}
