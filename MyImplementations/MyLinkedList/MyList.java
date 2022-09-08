package MyImplementations.MyLinkedList;


public interface MyList {
    int size();
    Object get(int index);
    void add(Data item);
    boolean remove(Data item);

    boolean isEmpty();

    void clear();

    void show();
}
