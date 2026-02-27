public class gcd {
    public static void main(String[] args) {
        int a=45;
        int b=15;
        System.out.println(gcd(a,b));
        return;
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
}
