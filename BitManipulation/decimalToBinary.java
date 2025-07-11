package BitManipulation;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 31; i >=0 ; i--) {
            int bitmask=1<<i;
            System.out.print((bitmask & num) != 0 ? 1 : 0);
        }

    }
}
