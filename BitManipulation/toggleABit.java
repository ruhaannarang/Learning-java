package BitManipulation;
import java.util.*;
public class toggleABit {
    public static void main(String[]args) {
//        Scanner sc = new Scanner(System.in);
        int n=7;
        int pos=0;
        int bitmask=1<<pos;
        if ((bitmask & n) != 0){
            int notbit = ~bitmask;
            int ans = notbit & n;
            System.out.println(ans);
        }
        else if ((bitmask & n)==0) {
            int ans=bitmask | n;
            System.out.println(ans);
        }


    }
}
