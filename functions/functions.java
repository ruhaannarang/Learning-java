package functions;

import java.util.*;
//syntax of function
//returnType functionName(type arg1, type arg2..){
//
// }
public class functions {
    //print a given name in a function
    public static void YourName(String name){
        System.out.println("Your name is " + name);
        return;
    }
    public static void main(String[]args){
        System.out.print("Enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        YourName(name);




    }
}
