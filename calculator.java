import java.util.*;
public class calculator {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        float a=sc.nextFloat();
        System.out.println("Enter another number");
        float b=sc.nextFloat();
        System.out.println("To add press 1 \n To subtract press 2 \n To multiply press 3 \n To divide press 4 \n To get remainder press 5");
        int fn =sc.nextInt();
        switch(fn){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
