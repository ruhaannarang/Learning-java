package BitManipulation;

import java.util.*;
public class updateBit {
//    to make 0 use clear operation and to make 1 use set operation

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int oper=sc.nextInt();
        if(oper==0){  //to clear bit(1)
            int notbit = ~bitmask;
            int ans=bitmask & notbit;
            System.out.println(ans);
        }
        else if(oper==1){  //to set bit
            int newnum=n|bitmask;
            System.out.println(newnum);
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
