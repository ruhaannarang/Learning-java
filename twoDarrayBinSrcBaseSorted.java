public class twoDarrayBinSrcBaseSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,4,7},
                {8,9,15},
                {20,130,240}
        };
        int ans1=-1;
        int ans2=-1;
        int target=130;
        int start=0;
        int end=matrix[0].length-1;
        int row=0;
        while (start<=end){
            if (matrix[row][matrix[0].length-1]<target){
                row++;
                continue;
            } else if (matrix[row][0]>target) {
                System.out.println("Not found");
                break;
            }
            else{
                int mid=start+(end-start)/2;
                if (matrix[row][mid]==target){
                    System.out.println(row+" "+ mid);
                    break;
                } else if (matrix[row][mid]>target) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
    }

}
