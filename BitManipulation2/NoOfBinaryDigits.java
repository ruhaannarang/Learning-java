package BitManipulation2;

public class NoOfBinaryDigits {
    public static void main(String[] args) {
        int n=8;
        int b=2;
        int ans=((int)(Math.log(n)/Math.log(b)))+1;
        System.out.println(ans);
    }
}
