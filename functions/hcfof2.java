package functions;

public class hcfof2 {
    public static int hcf(int a,int b){
        if (a<b){
            for (int i=a;i>=1;i--){
                if (a%i==0 && b%i==0){
                    return i;
                }
            }
        }
        else {
            for (int i=b;i>=1;i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
    public static void main(String[]args){
        System.out.println(hcf(737,1353));
    }
}
