package DAY18;

public class RotateMatrixToRight {
    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
		// Write your code here.
		int[][] arr = new int[n][m];
		k=k%m;

			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					int newColumn = (j + k) % m;
					arr[i][newColumn] = mat[i][j];
									
				}
			}


		return arr;
			
	}
}
