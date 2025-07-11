package BitManipulation;

import java.util.Scanner;

public class numberOF1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;

        int c = 0;

        for (int i = 0; i < 32; i++) {
            int bitmask = 1 << i;

            if ((bitmask & n) != 0) {
                c++;
            }

        }

        System.out.println(c);
    }
}