package functions;

public class exponent {
    public static int exponent(int x,int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*x;
        }
        return ans;
    }
    public static void main(String[]args){
        System.out.println(exponent(2,3));
    }

}
