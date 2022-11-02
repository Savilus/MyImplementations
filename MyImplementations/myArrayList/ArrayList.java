package MyImplementations.myArrayList;

import MyImplementations.myLinkedList.Data;

public interface ArrayList{

    int size();

    Object get(int index);

    void add(Data item);

    boolean removeFirst(int index);

    boolean removeFirst(Data item);

    boolean isEmpty();

    void clear();

    void show();


}
