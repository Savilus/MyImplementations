package MyImplementations.myMap;


public class MyHashMap<K, V> implements HashMap<K, V> {

    public class Entry<K, V> {

        private K key;
        private V value;

        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private int mapSize = 0;

    private Entry<K, V> mapTable[];

    public MyHashMap() {
        mapTable = new Entry[SIZE];
    }

    @Override
    public void put(K key, V value) {
        int hashCode = key.hashCode() % SIZE;
        // Entry will be a number(because of hashcode) in array where to put Key and Value
        Entry<K, V> entry = mapTable[hashCode];

        if (entry == null) {
            mapTable[hashCode] = new Entry<>(key, value);
        } else {
            while (entry.next != null) {
                if (entry.getKey() == key) {
                    entry.setValue(value);
                    mapSize++;
                    return;
                }
                entry = entry.next;
            }

            if (entry.getKey() == key) {
                entry.setValue(value);
                mapSize++;
                return;
            }

            entry.next = new Entry<>(key, value);
            mapSize++;
        }
    }

    @Override
    public V get(K key) {
        int hashCode = key.hashCode() % SIZE;
        Entry<K, V> entry = mapTable[hashCode];

        if (entry == null) {
            return null;
        } else {
            while (entry != null) {
                if (entry.getKey() == key) {
                    return entry.getValue();
                }
                entry = entry.next;
            }
            return null;
        }
    }

    @Override
    public boolean remove(K key) {
        int hashCode = key.hashCode() % SIZE;
        Entry<K, V> entry = mapTable[hashCode];


        if (entry == null) {
            return false;
        } else {
                if (entry.getKey() == key) {
                    mapTable[hashCode] = entry.next;
                    entry.next = null;
                    return true;
                }

            Entry<K, V> previous = entry;
            entry = entry.next;

            while(entry.next != null){
                if (entry.getKey() == key) {
                    previous.next = entry.next;
                    entry.next = null;
                    return true;
                }

                previous = entry;
                entry = entry.next;
            }
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.mapSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return mapSize;
    }

    @Override
    public void clear() {
        mapTable = new Entry[SIZE];
        this.mapSize = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (mapTable[i] != null) {
                sb.append(i + " " + mapTable[i] + "\n");
            } else {
                sb.append(i + " " + "null" + "\n");
            }
        }

        return sb.toString();
    }
}
