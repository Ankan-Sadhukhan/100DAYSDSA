package DAY22;

public class SearchinRotatedSortedArray {
    public static int check(int[] arr, int x){
        if(arr[x] < arr[0]){
            return 1;
        }else{
            return 0;

        }
    }

    public static int bsearch(int[] arr, int st, int end, int key){
        

        while(st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid] > key){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return -1;
    }
    
    public int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length -1;
        int ans = 0;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(arr[mid]==key) return mid;
            if(check(arr, mid) == 1){
                ans = mid;
                high = mid-1;
            }else{
                low = low+1;
            }
        }

        int p1 = bsearch(arr, 0, ans-1, key);
        int p2 = bsearch(arr, ans, arr.length-1, key);

        if(p1 != -1)return p1;
        if(p2 != -1) return p2;

        return -1;
    }
}
