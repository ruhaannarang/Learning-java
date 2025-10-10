public class recursion {
    public static void printNumbers(int n){
        System.out.println(n);
        if(n==0){
            return;
        }
        printNumbers(n-1);
    }
    public static void main(String[]args){
        for(int i=5;i>=0;i--){
            System.out.println(i);
        }
        printNumbers(5);
    }
}
