package MyImplementations.myArrayList;

import MyImplementations.myLinkedList.Data;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(10);
        String[] tescik = {"abc", "abc", "abc"};
        MyArrayList myArrayList = new MyArrayList();
        MyArrayList myArrayList2 = new MyArrayList();

        myArrayList.add(new Data<>("String"));
        List<Integer> test2 = new ArrayList<>();
        
        test2.add(3);
        test2.add(3);


        Data integer1 = new Data(1);
        Data integer2 = new Data(2);
        Data integer3 = new Data(3);
        Data integer4 = new Data(4);
        Data integer5 = new Data(5);
        Data integer6 = new Data(6);
        Data integer7 = new Data(7);
        Data integer8 = new Data(8);
        Data integer9 = new Data(9);
        Data integer10 = new Data(10);
        Data integer11 = new Data(11);
        Data integer12 = new Data(12);
        Data integer13 = new Data(13);

        myArrayList.add(integer1);
        myArrayList.add(integer2);
        myArrayList.add(integer3);
        myArrayList.add(integer4);
        myArrayList.add(integer5);
        myArrayList.add(integer6);
        myArrayList.add(integer7);
        myArrayList.add(integer8);
        myArrayList.add(integer9);
        myArrayList.add(integer10);
        myArrayList.add(integer12);
        myArrayList2.add(integer11);
        myArrayList2.add(integer8);
        myArrayList2.add(integer7);

        System.out.println("List 2 show: ");
        myArrayList2.show();
        System.out.println("List 1 show: ");
        myArrayList.show();
        System.out.println("List size: " + myArrayList.size());
        System.out.println("List size 2: " + myArrayList2.size());
        System.out.println("-----");

        myArrayList.removeFirst(0);
        myArrayList.removeFirst(0);
        myArrayList.removeFirst(integer3);
        myArrayList.removeFirst(integer7);
        myArrayList.removeFirst(integer10);
        System.out.println("Did element get deleted: " + myArrayList.removeFirst(integer12));
        System.out.println("Did element get deleted: " + myArrayList.removeFirst(integer13));
        System.out.println("Did element get deleted: " + myArrayList.removeFirst(25));

        myArrayList.show();
        System.out.println("List size: " + myArrayList.size());
        System.out.println("List size2 : " + myArrayList2.size());
        System.out.println("-----");
        System.out.println(myArrayList.get(2));
//        System.out.println(myArrayList.get(5));

        System.out.println("----");
        myArrayList.clear();
        myArrayList2.clear();

        System.out.println("List 1 show: ");
        myArrayList.show();
        System.out.println("List 2 show: ");
        myArrayList2.show();

    }
}
