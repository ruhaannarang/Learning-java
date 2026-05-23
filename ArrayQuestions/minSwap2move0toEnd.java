package ArrayQuestions;

public class minSwap2move0toEnd {
    public static void main(String[] args) {
        int[] nums={1,2,0,2,0,1,0};
        int a=0;
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[nums.length-1-a];
                nums[nums.length-1-a]=temp;
                a++;
                i--;
            }
        }
        System.out.println(a);
    }
}
