package BitManipulation;

public class getbit {
    public static void main(String[]args){
        int n=8;
        int pos=2;
        int bitmask=1<<pos;

        if ((bitmask & n) ==0){
            System.out.println("bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }
    }
}
