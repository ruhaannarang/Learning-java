import java.util.*;
public class greeetingbutton {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("type: \n 1 for English \n 2 for Hindi \n 3 for French");
        int input=sc.nextInt();
//        if (input==1){
//            System.out.println("Hello");
//        }
//        else if(input==2){
//            System.out.println("Namaste");
//
//        }
//        else if(input==3){
//            System.out.println("Bonjour");
//        }
//        else{
//            System.out.println("Invalid input!! Retry");
//        }
        switch(input){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
