package MyImplementations.MyLinkedList;

public class MyLinkedList<T>  implements MyList {
    private Node first;
    private int size;

    class Node<T> {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        if(index < 0){
            throw new IndexOutOfBoundsException("You can not get negative number. List start with index = 0");
        }
        int countIndex = 0;
        Node n = first;

        while (n.next != null) {
            if (countIndex == index) {
                return n.data;
            }
            n = n.next;
            countIndex++;
        }
        if (countIndex == index) {
            return n.data;
        }
        return null;
    }

    @Override
    public void add(Data item) {

        Node current = new Node(item);
        current.next = null;
        this.size++;

        if (first == null) {
            first = current;
        } else {
            Node n = first;

            while (n.next != null) {
                n = n.next;
            }
            n.next = current;
        }
    }

    @Override
    public boolean remove(Data item) {
        Node n = first;
        Node lookingFor = new Node<>(item);
        Node previous = null;

        while(n.next != null) {
            if (lookingFor.data.equals(n.data)) {
                n.data = n.next.data;
                n.next= n.next.next;
                this.size--;
                return true;
            }
            previous = n;
            n = n.next;
        }

        if(lookingFor.data.equals(n.data)){
            previous.next = null;
            this.size--;
            return true;
        }
      return false;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else return false;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public void show() {
        Node first = this.first;

        System.out.println(first.data);
        while (first.next != null) {
            first = first.next;
            System.out.println(first.data);
        }

    }


}
