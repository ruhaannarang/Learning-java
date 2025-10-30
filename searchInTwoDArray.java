import java.util.Arrays;
public class searchInTwoDArray {
    public static  void main(String[]args){
        int[][] arr={
                {14,5,44,4,4,8},
                {7,88,96,4},
                {41,9,143,1432}
        };
        int target=143;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int [][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    int[] ans={i,j};
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
