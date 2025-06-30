import java.util.*;
public class strings {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//       String declaration
//    String name="Tony";
//    String fullName="Tony Stark";
//    String yourName=sc.nextLine();
//        System.out.println("Your name is "+yourName);
    String firstName="Tony";
    String lastName="Stark";
    String FullName = firstName + " " + lastName;
        System.out.println(FullName);
        System.out.println(FullName.length());

        //charAt
        for(int i=0;i<=FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
