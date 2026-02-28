package recursions;

public class sortedArray {
    static boolean checkSorted(int []arr,int start){
        if(start==arr.length-1){
            return true;
        }
        else{
            return ((arr[start]<arr[start+1]) && checkSorted(arr,start+1));
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,9,10};
        System.out.println(checkSorted(arr,0));
    }
}
