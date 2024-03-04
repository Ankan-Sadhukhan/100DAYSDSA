package DAY5;

public class MatrixSymmetric {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                if(matrix[i][j] != matrix[j][i]) return false;
            }
        }

        return true;
        
    }
}
