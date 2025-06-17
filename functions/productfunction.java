package functions;

import java.util.*;
public class productfunction {
    public static int CalculateProduct(int a ,int b){
        return a*b;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int a=sc.nextInt();
        System.out.print("\n Enter another number");
        int b=sc.nextInt();
        int sum=CalculateProduct(a,b);
        System.out.println("the Product is" + sum);

    }
}

