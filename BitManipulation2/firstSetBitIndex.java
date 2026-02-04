package BitManipulation2;

public class firstSetBitIndex {
    public static void main(String[] args) {
        int n=16;
        int i=0;
        while(((n>>i)&1)!=1){
            i++;
        }
        System.out.println(i+1);
    }
}
