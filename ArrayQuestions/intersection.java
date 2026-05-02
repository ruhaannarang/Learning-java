package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
    static int[] intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(!ans.contains(arr1[i])){
                        ans.add(arr1[i]);
                    }
                }
            }
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i); // auto-unboxing (Integer → int)
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={2,4,6,7,10,9};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
}
