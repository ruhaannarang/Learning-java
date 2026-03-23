public class binarySearchInInfiniteLoop {
    public static void main(String[]args){
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77};
        int target=44;
        System.out.println(ans(nums,target));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
