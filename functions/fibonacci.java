package functions;

public class fibonacci {
    public static void fibo(int n){
        int a=0;
        int b=1;
        if (n>=1) {
            System.out.print(a + " ");
        }
        if (n>=2) {
            System.out.print(b + " ");
        }
            for(int i=3;i<=n;i++){
                int series=(a+b);
                System.out.print(series+" ");
                a=b;
                b=series;
            }

    }
    public static void main (String[]args){
        fibo(2);
    }
}
