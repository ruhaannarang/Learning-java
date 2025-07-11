package BitManipulation;
import java.util.*;
public class checkPowerOf2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;

        int c=0;

        for (int i=0;i<32;i++){
            int bitmask=1<<i;

                if ((bitmask & n) != 0){
                    c++;
                }

        }

        if ( c==1){
            System.out.println("Number is a power of 2");
        }
        else {
            System.out.println("Not");
        }

    }
}
