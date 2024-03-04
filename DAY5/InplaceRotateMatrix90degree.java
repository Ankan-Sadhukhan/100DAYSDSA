package DAY5;

public class InplaceRotateMatrix90degree {
    public static void swap(int[][] arr, int i,int j){
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}
	
	public static void inplaceRotate(int[][] arr, int n) {
		// Write your code here.
		//transpose

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(arr, i,j);
            }
        }

		//row reverse
		
		for(int i=0;i<n;i++){
			int row=0;
			int col = n-1;
			while(row<col){
				int temp =arr[row][i];
				arr[row][i] = arr[col][i];
				arr[col][i] = temp;
				row++;
				col--;
			}
		}
		
	}
}
