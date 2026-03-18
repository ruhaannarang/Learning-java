package recursions;

public class bubbleSort {
    static void sort(int []arr,int a,int b) {
        if(a==0) {
            return;
        }
        if(b<a) {
            if(arr[b]>arr[b+1]) {
                int temp = arr[b];
                arr[b] = arr[a];
                arr[a] = temp;
            }
            sort(arr, a, b + 1);
        }
        else {
            sort(arr,a-1,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,21,91,3};
        sort(arr,4,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
