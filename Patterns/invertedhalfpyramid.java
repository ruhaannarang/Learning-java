package Patterns;

public class invertedhalfpyramid {
    public static void main(String[]args){
        int n=4;
//        for(int i=r;i>=1;i--){
//            for(int j=i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=r;k++){
//                System.out.print("*");
//            }
//            System.out.println();
        for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
