import java.util.ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(34);
        list.add(663);
        list.add(32);
        list.add(6);
        list.add(644);
        list.add(6);
        list.add(7);
        list.add(88);
        list.add(0);
        list.add(6478);
        list.add(6874);
        System.out.println(list.contains(7));
        list.set(0,888);
        list.remove(7);
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
