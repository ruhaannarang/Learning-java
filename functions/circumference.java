package functions;

public class circumference {
    public static float circumference(int r){
        float pi=3.14f;
        float circumference=pi*r*2;
        return circumference;

    }
    public static void main(String[]args){
        System.out.println(circumference(7));
    }
}
