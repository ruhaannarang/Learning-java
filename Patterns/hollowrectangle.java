package Patterns;

public class hollowrectangle {
    public static void main(String[]args){
        int r=6;
        int c=5;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++) {
                if (j == 5 || j == 1 || i == 1 || i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

    }
}
