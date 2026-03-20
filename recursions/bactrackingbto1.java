package recursions;

public class bactrackingbto1 {
    static void printnum(int n){
//        int a=0;
        if(n==0){
            return;
        }
        printnum(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        printnum(5);
    }
}

