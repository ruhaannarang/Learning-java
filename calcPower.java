public class calcPower {
    public static int  calcPower(int x,int n){
//        high stack height
//
//    if (x==0){
//        return 0;
//    }
//    if (n==0){
//        return 1;
//    }
//    int power1=calcPower(x,n-1);
//    int power=x*power1;
//    return power;

//        logn stack height
        if (x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }
        else{
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }



    }
    public static void main(String[]args){
        System.out.println(calcPower(4,3));

    }
}
