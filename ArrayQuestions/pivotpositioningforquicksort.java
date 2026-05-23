package ArrayQuestions;

import java.util.Arrays;

public class pivotpositioningforquicksort {
    public static void main(String[] args) {
        int[] arr={7,5,3,1,4,9,5};
        int pivot=arr[0];
        int i=0;
        int l=arr.length-1;
        for(int j=0;j<arr.length;j++){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=pivot;
                pivot=temp;
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
