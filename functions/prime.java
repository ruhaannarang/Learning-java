package functions;
import java.util.*;
public class prime {
    public static boolean prime(int num){
        boolean isprime = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isprime = false;
                return isprime;
            }
        }
        return isprime;
    }
    public static void main(String[]args){
        if(prime(14) == true){
            System.out.println("is prime");
        } else {
            System.out.println("not prime");
        }
    }
}
