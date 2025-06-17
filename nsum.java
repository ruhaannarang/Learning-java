import java.util.*;
public class nsum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int sum=0;
       int a=sc.nextInt();
       for(int i=0;i<=a;i++){
           sum=sum+i;
       }
        System.out.println(sum);
    }
}
