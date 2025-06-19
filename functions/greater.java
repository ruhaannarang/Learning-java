package functions;

public class greater {
    public static int greater(int a,int b){
        if(a<b){
            return b;
        }
        else {
            return a;
        }
    }
    public static void main(String[]args){
        System.out.println(greater(99,5));
    }
}
