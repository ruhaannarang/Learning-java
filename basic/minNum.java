public class minNum {
    public static void main(String[]args){
        int[] nums={2,-993,5,-9,0,99,-56};
        System.out.println(minNum(nums));
    }
    public static int minNum(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
