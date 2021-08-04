package b10_dsa_danh_sach.thuc_hanh.trien_khai_lish;

import java.util.Arrays;

public class MyList<E> {
    private  int size=0;
    private int DEFAULT_CAPACITY=10;
    private E[] elements;

    public MyList() {
        elements= (E[]) new Object[DEFAULT_CAPACITY];
    }
    public void add(E w) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size]= w;
        size++;
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
