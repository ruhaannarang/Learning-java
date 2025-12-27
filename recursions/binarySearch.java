package recursions;

public class binarySearch {
    static int search(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid] < target) {
            return search(arr,mid+1, end, target);
        }
        else {
            return search(arr,start,mid-1,target);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7,9,15,26,36,53,59,88,99};
        int ans=search(arr,0,arr.length-1,15);
        System.out.println(ans);
    }
}
