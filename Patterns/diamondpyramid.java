package Patterns;

public class diamondpyramid {
    public static void main(String[]args){
        int n=4;
        for (int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("*");
            }
            for (int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
