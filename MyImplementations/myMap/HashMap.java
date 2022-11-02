package MyImplementations.myMap;

public interface HashMap<K, V> {

    void put(K key, V value);

    V get(K key);

    boolean remove(K key);

    boolean isEmpty();

    int size();

    void clear();


}
