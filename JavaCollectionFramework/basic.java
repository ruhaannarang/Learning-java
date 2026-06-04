package JavaCollectionFramework;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Collection<Integer> collection=new ArrayList<>();
        arr.add(5);
        arr.add(10);
        list.addAll(arr);
        list.add(10);
        System.out.println(arr);
        System.out.println(list);
        arr.remove(0);
        System.out.println(arr);
    }
}
