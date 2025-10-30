public class binarySearchDescending {
    public static void main(String[]args){
        int[] nums={99,88,65,44,38,20,19,13,8,4,2,1,0};
        int target=13;
        int ans= binarySearch(nums,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
