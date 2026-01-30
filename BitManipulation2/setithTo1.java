package BitManipulation2;

public class setithTo1 {
    public static void main(String[] args) {
        int n=8;
        int r=1;
        int i=3;
        n=(n|(r<<(i-1)));
        System.out.println(n);
    }
}
