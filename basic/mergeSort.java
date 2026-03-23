import java.util.Arrays;

public class mergeSort {
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int [] left=sort(Arrays.copyOfRange(arr,0,mid));
        int [] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    static int[] merge(int[] left, int[] right){
        int i = 0, j = 0, index = 0;
        int[] ans = new int[left.length + right.length];

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[index++] = left[i++];
            } else {
                ans[index++] = right[j++];
            }
        }

        while(i < left.length){
            ans[index++] = left[i++];
        }

        while(j < right.length){
            ans[index++] = right[j++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,43,5,22,53,21,6,3};
        int[] ans=sort( arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
