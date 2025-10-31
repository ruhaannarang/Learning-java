public class floorOfaNum {
    public static void main(String[]args){
        int [] arr={0,1,3,5,6,7,8,9,13,56,75,666};
        int target=8;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        if (target > arr[end]) {
            return -1;
        }
        if (target < arr[start]) {
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        while(end>=start){
            int mid=start+(end-start)/2;
            if (arr[mid]<target) {
                start=mid+1;
            } else if (arr[mid]>target ) {
                end=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        return end;
    }
}
