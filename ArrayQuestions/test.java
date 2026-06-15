package ArrayQuestions;

public class test {
    public static void main(String[] args) {
        int[] nums={2,3,-1,8,4};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int rightsum=sum;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                leftsum+=nums[i-1];
            }
            rightsum-=nums[i];
            System.out.println(leftsum+ " "+ rightsum);
//            System.out.println(rightsum);
            if(leftsum==rightsum){
                System.out.println(" ");
            }
//                return i;
        }
//        return -1;
    }
}
