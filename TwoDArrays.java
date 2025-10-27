import java.util.*;
public class TwoDArrays {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][]TwoDArray=new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                TwoDArray[i][j]=sc.nextInt();
            }
        }
//        System.out.println(TwoDArray);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(TwoDArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
