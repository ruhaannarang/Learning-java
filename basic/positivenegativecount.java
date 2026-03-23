import java.util.*;
public class positivenegativecount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ans;
        int negative=0;
        int positive=0;
        int zero=0;
        do{
            int a = sc.nextInt();
            if (a < 0) {
                negative++;
            }
            else if(a>0){
                positive++;
            } else if (a==0) {
                zero++;
            }
            System.out.println("do you want to continue press 1 to continue and 2 to end");
            ans = sc.nextInt();
            if (ans==2){
                break;
            }


        }
        while (ans==1);

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

    }
}
