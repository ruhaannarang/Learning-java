package BitManipulation;

public class clearBit {
    public static void main(String[]args){
        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        int ans = ~bitmask;
        int finalAns = ans & n;
        System.out.println(finalAns);
    }
}
