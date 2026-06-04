package JavaCollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist=new LinkedList<>();
        linkedlist.add(5);
        linkedlist.add(7);
        linkedlist.add(18);
        System.out.println(linkedlist.size());
        System.out.println(linkedlist);

        Iterator<Integer> iterator=linkedlist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
