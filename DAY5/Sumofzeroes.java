package DAY5;

import java.util.ArrayList;

public class Sumofzeroes {
    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		int count=0;
		int n = mat.size();
		int m = mat.get(0).size();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat.get(i).get(j)==0){
					if(j>0 && mat.get(i).get(j-1)==1) count++;
					if(j<m-1 && mat.get(i).get(j+1)==1) count++;
					if(i>0 && mat.get(i-1).get(j)==1) count++;
					if(i<n-1 && mat.get(i+1).get(j)==1) count++;
				}
			}
		}
		return count;
	}
}
