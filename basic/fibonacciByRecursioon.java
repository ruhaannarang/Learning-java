public class fibonacciByRecursioon {
    public static  void fs(int a, int b, int n){

        int c=a+b;
        if(n==0) {
            return;
        }
        System.out.print(c+" ");
        fs(b,c,n-1);

    }
    public static void main(String []args){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");

    fs(0,1,7);
    }
}
