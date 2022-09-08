package MyImplementations.MyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        MyLinkedList<Integer> newList = new MyLinkedList();
        Data integer1 = new Data(5);
        Data integer2 = new Data(15);
        Data integer3 = new Data(25);
        Data integer4 = new Data(35);
        Data integer6 = new Data(40);

        newList.add(integer1);
        newList.add(integer2);
        newList.add(integer3);
        newList.add(integer4);


        System.out.println("--- List size ---");
        System.out.println(newList.size());
        System.out.println("--- List show ---");
        newList.show();
        System.out.println("--- List get index 1 before remove ---");
        System.out.println(newList.get(1));
        System.out.println("--- List size before remove: " + newList.size());
        System.out.println("--- List remove ---");
        System.out.println(newList.remove(integer2));
        System.out.println(newList.remove(integer6));
        System.out.println("--- List size after remove: " + newList.size());
        System.out.println("--- List show after remove:");
        newList.show();
        System.out.println("--- List get index 1 after remove ---");
        System.out.println(newList.get(1));
        System.out.println("Index 6(not in the list) - " + newList.get(6));
        System.out.println("--- List cleared ---");
        newList.clear();
        newList.size();
        newList.add(integer6);
        System.out.println("---List after clear and add one object");
        newList.show();
        newList.size();
    }
}
