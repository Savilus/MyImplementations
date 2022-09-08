package MyImplementations.MyLinkedList;

import java.util.Objects;

public class Data<T>{

    private T data;

    public Data(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  data + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data<?> data1 = (Data<?>) o;
        return Objects.equals(data, data1.data);
    }


}
