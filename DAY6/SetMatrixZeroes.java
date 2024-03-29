package DAY6;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] row = new int[n];
        Arrays.fill(row,0);
        int[] col = new int[m];
        Arrays.fill(col,0);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] =0;
                }
            }
        }
    }

}
