package BitManipulation2;

public class setBits {
    public static void main(String[] args) {
        int n=535;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(CountSetBits(n));
    }
    static int CountSetBits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
