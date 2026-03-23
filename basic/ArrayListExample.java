import java.util.ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(7);
        list.add(67);
        list.add(1,4);
        list.add(6874);
        list.add(56);
        list.add(77);
        System.out.println(list);
        list.remove(2);
//        System.out.println(list.contains(7));
//        list.set(0,888);

        System.out.println(list);
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
