public class searchInRange {
    public static void main(String[] args){
        int[] num={2,56,23,6,34,663,3,1,66,333};
        int target=2;
        System.out.println(linearSrc(num,target,2,6));
    }
    public static int linearSrc(int[] arr,int target , int start,int end){
        if (arr.length==0){
            return -1;

        }
        for (int i = start; i < end; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
