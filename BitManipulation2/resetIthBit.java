package BitManipulation2;

public class resetIthBit {
    public static void main(String[] args) {
        int n=31;
        int i=5;
        n=n&(~(1<<(i-1)));
        System.out.println(n);

    }
}
