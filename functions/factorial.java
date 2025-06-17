package functions;
import java.util.*;
public class factorial {
    public static int fact(int a){
        int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Factorial is " + fact(a));

    }
}
