import java.util.*;
public class maxinarray {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int[] arr={2,4,6,7,8,3,1,55, 7, 63, 4};
        for(int i=0;i<arr.length;i++){
            int isgreater=0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j]>arr[i]){
                    isgreater++;

                }

            }
            if (isgreater==0){
                System.out.println(arr[i]);
            }


        }


//        Optimized way

//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
    }

}
