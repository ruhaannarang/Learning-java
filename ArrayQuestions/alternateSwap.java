package ArrayQuestions;

import java.util.Arrays;

public class alternateSwap {
    static void swap(int[] arr){
        for(int i=0;i<arr.length;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,3,7,5,9};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
