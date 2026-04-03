package basic;
import java.util.Arrays;
public class quickSort {

    static int pos(int[] arr,int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && arr[i]<pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return i;
    }
    static void quickSort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int p=pos(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    public static void main(String[] args) {
        int[] arr={4, 6, 2, 5, 7, 9, 1};
        int low=0;
        int high=arr.length-1;

        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
