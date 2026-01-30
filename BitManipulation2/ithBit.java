package BitManipulation2;

public class ithBit {
    public static void main(String[] args) {
        int i=3;
        int n=32;
        int ans=(n>>(i-1))&1;
        System.out.println(ans);
    }
}
