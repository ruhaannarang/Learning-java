public class linearSearch {
    public static void main(String[] args){
       int[] num={2,56,23,6,34,663,3,1,66,333};
       int target=1000;
        System.out.println(linearSrc(num,target));
    }
    public static int linearSrc(int[] arr,int target){
        if (arr.length==0){
            return -1;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
