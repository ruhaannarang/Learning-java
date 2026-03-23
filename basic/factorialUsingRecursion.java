public class factorialUsingRecursion {
//    public static void factorial(int i, int fact, int n){
//        fact=fact*i;
//        if(i==n){
//            System.out.println(fact);
//            return;
//        }
//        factorial(i+1,fact,n);

//    }
public static int factorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    int fact1=factorial(n-1);
    int fact=fact1*n;
    return fact;
}
    public static void main(String []args){
        System.out.println(factorial(5));
    }
}
