package MyImplementations.myArrayList;

import MyImplementations.myLinkedList.Data;

public class MyArrayList implements ArrayList {

    final int INITIAL_CAPACITY = 10;
    private Data[] array;
    private int size = 0;



    public MyArrayList() {
        this.array = new Data[INITIAL_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        if (index >= size) {
           throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void add(Data item) {
        this.array[size] = item;
        this.size++;

        if (size == array.length) {
            Data[] newArray = new Data[(array.length * 3) / 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    @Override
    public boolean removeFirst(int index) {
        if (index >= size) {
            return false;
        }
        this.array[index] = null;
        this.size--;

        Data[] newArray = new Data[size];
        for (int i = 0, j = 0; i < size; i++) {
            if (array[i] != null) {
                newArray[j] = array[i];
                j++;
            }
        }

        array = newArray;
        return true;
    }

    @Override
    public boolean removeFirst(Data item) {
        boolean result = false;

        Data[] newArray = new Data[size];
        try {
            for (int i = 0, j = 0; i < size; i++, j++) {
                if (item.equals(array[i])) {
                    array[i] = null;
                    result = true;
                    i++;
                }
                if (i != size) {
                    newArray[j] = array[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return result;
        }
        array = newArray;
        size--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        array = new Data[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void show() {
        if(size == 0){
            System.out.println("Your list is empty.");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
