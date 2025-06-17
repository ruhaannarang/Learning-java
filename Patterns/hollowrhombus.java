package Patterns;

public class hollowrhombus {
    public static void main(String[]args){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if (k==1||k==n||i==1||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
