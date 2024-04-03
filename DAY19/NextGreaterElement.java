package DAY19;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int[] output = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);

		for(int i=1;i<arr.length;i++){

			while(!st.isEmpty() && arr[st.peek()]<arr[i]){
				output[st.pop()] = arr[i];
			}
			st.push(i);
		}

		while(!st.isEmpty()){
			int idx = st.pop();
			output[idx] = -1;
		}

		return output;
		
	}
}
