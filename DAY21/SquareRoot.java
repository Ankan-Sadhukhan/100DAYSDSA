package DAY21;

public class SquareRoot {
    public static int check(int mid, int n){

		if(mid <=n/mid){
			return 1;
		}
		return 0;
	}

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 
		 */

		 if((int)N ==0 || (int)N==1) return (int)N;
		 
		 int start =1;
		 int end = (int)N;
		 int ans = 0;
		 while(start <= end){

			 int mid = start + (end-start)/2;
			 if(check(mid, (int)N) == 1){
				 ans = mid;
				 start = mid+1;
			 }else{
				 end = mid-1;
			 }
		 }

		 return ans;
	}
}
