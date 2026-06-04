package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorr {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(7);
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
