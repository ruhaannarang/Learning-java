package recursions;

import java.util.ArrayList;

public class linearSearchMultipleIndex {
    static ArrayList <Integer> list = new ArrayList<>();
    static void search(int arr[],int start,int target){
        if(start==arr.length){
            return;
        }
        if(arr[start]==target){
            list.add(start);
        }

            search(arr,start+1,target);


    }
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7,9,15,15,15,26,36,53,59,88,99};
        search(arr,0,15);
        System.out.println(list);
    }
}
