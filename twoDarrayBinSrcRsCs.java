public class twoDarrayBinSrcRsCs {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,4,7},
                {5,9,15},
                {6,13,24}
        };
        int ans1=-1;
        int ans2=-1;
        int target=6;
        for (int i = 0; i < matrix[0].length; i++) {
            int start=0;
            int end=matrix.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(matrix[mid][i]==target){
                    ans1=mid;
                    ans2=i;
                    break;
                }
                else if(matrix[mid][i]<target){
                    start=mid+1;
                } else if (matrix[mid][i]>target) {
                    end=mid-1;
                }
                else{
                    ans1=-1;
                    ans2=-1;
                }
            }
            if(ans1!=-1){
                break;
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
}
