import java.util.*;
public class menudrivenprogram {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter either 0 or 1");
        int num=sc.nextInt();

        if(num==1){
            do{
                System.out.println("Enter your marks out of 100");
                int marks=sc.nextInt();
                 if (marks>=90){
                     System.out.println("this is good");
                 }
                 else if(marks<=89 && marks>=60){
                     System.out.println("This is also good");
                 }
                 else if(marks>0 && marks<=59){
                     System.out.println("This is good as well");
                 }
                 else if (marks==0) {
                     break;
                 }

            }
            while(num==1);
        }
        else if(num==0){

        }

    }
}
