package Patterns;

public class butterflypattern {
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=n-i;k>=1;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a=n;a>=1;a--){
            for(int b=a;b>=1;b--){
                System.out.print("*");
            }
            for(int j=0;j<n-a;j++){
                System.out.print("  ");
            }
            for(int b=a;b>=1;b--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
