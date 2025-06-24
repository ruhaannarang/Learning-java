import java.util.*;
public class inputarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String numbers[]=new String[size];

//        input
        for(int i=0;i<size;i++){
            System.out.println("please enter" + i);
            numbers[i]=sc.nextLine();
        }
//       output
      for (int i=0;i<size;i++){
          System.out.println(numbers[i] + i);
      }

    }
}
