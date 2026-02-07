package BitManipulation2;

public class duplicate3 {
    public static void main(String[] args) {
        int[] nums={2,3,3,3,2,2,6,6,4,6};
        int result = 0;

        for (int i = 0; i < 32; i++) {  // for each bit
            int sum = 0;

            for (int num : nums) {
                if ((num & (1 << i)) != 0) {  // check ith bit
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result = result | (1 << i);
            }
        }

        System.out.println(result);
    }
}
