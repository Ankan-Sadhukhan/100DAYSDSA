class Solution {
    public int lb(int[] arr, int x){
        int left = 0, right = arr.length-1, ans=-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] <= x){
                left = mid+1;
                ans = mid;
            }else{
                right = mid-1;
            }
        }
        return ans+1;// ans init with -1 because if no element is less than x then the count of loer bond will be -1+1 ==0.
    }

    public boolean check(int[][] matrix, int mid, int k){
        int cnt = 0;
        for(int i=0;i<matrix.length;i++){
            int c = lb(matrix[i],mid);
            System.out.println(c);
            cnt += c;
        }
        return cnt >=k;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int left = matrix[0][0], n = matrix.length, m = matrix[0].length, right = matrix[n-1][m-1];
        if(n==1 && m==1){
            return left;
        }

        int ans = 0;
        
        while(left <= right){
            int mid = left+(right-left)/2;

            if(check(matrix, mid, k)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}