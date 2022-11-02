package MyImplementations.myLinkedList;

public class MyLinkedList implements LinkedList {
    private Node head;
    private int size;

    class Node<T> {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("You can not get negative number. List start with index = 0");
        }
        try {
            int countIndex = 0;
            Node n = head;

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
        } catch (NullPointerException exception) {
            if (this.size == 0) {
                System.out.println("Your list is empty. You can't delete this item.");
            } else {
                System.out.println("Something went wrong!");
            }
        }
        return null;
    }


    @Override
    public void add(Data item) {

        Node current = new Node(item);
        current.next = null;
        this.size++;

        if (head == null) {
            head = current;
        } else {
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = current;
        }
    }

    @Override
    public boolean removeFirst(Data item) {
        Node n = head;
        Node previous = null;

        try {
            while (n.next != null) {
                if (item.equals(n.data)) {
                    n.next = n.next.next;
                    this.size--;
                    return true;
                }
                previous = n;
                n = n.next;
            }
            if (item.equals(n.data)) {
                previous.next = null;
                this.size--;
                return true;
            }

        } catch (NullPointerException exception) {
            if (this.size == 0) {
                System.out.println("Your list is empty. You can't delete this item.");
            } else {
                System.out.println("Something went wrong!");
            }
        }
        return false;
    }

    public boolean removeAll(Data item) {
        Node n = head;
        Node previous = null;


        while (n.next != null) {
            while (n.next != null) {
                if (item.equals(n.data)) {
                    n.next = n.next.next;
                    this.size--;
                }
                previous = n;
                n = n.next;
            }
        }

        if (item.equals(n.data)) {
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
        head = null;
        size = 0;
    }

    @Override
    public void show() {
        if (this.size != 0) {
            Node first = this.head;
            System.out.println(first.data);
            while (first.next != null) {
                first = first.next;
                System.out.println(first.data);
            }
        } else {
            System.out.println("Linked list is empty.");
        }
    }

}


