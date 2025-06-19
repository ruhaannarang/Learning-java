package functions;

public class eligibiltytovote {
    public static void vote(int age){
        if(age<18){
            System.out.println("not eligible");
        }
        else {
            System.out.println("eligible");
        }
    }
    public static void main(String[]args){
        vote(17);
    }
}
