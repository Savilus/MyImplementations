package MyImplementations.myLinkedList;


public interface LinkedList<T> {
    int size();
    T get(int index);
    void add(Data item);
    boolean removeFirst(Data item);
    boolean removeAll(Data item);
    boolean isEmpty();
    void clear();
    void show();
}
