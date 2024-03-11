package DAY10;

public class MoveNegativeNumberToStart {
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int[] separateNegativeAndPositive(int a[]) {
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[j]<0){
                swap(a,i,j);
                i++;
            }else{
                j--;
            }
        }
        return a;
    }
}
