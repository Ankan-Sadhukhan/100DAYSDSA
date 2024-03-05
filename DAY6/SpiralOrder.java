package DAY6;

public class SpiralOrder {
    public static void spiralPrint(int matrix[][]){
		//Your code goes here
		int n= matrix.length;
		int m;
		if(n>0){
			 m=matrix[0].length;
		}else{
			m=n;
		}
		
		
		int count = n*m;
		int stRow=0;
		int stCol=0,endCol=m-1,endRow=n-1;
		while(count>=0){
			for(int i=stCol;i<=endCol;i++){
				System.out.print(matrix[stRow][i]+" ");
				count--;
			}
			stRow++;
            if(count==0) break;


			for(int i=stRow;i<=endRow;i++){
				System.out.print(matrix[i][endCol]+" ");
				count--;
			}
			endCol--;
            if(count==0) break;


			for(int i=endCol;i>=stCol;i--){
				System.out.print(matrix[endRow][i]+" ");
				count--;
			}
			endRow--;
            if(count==0) break;


			for(int i=endRow;i>=stRow;i--){
				System.out.print(matrix[i][stCol]+" ");
				count--;
			}
			stCol++;
		}
	}

}
