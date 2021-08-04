package b10_dsa_danh_sach.bai_tap;


import java.util.Arrays;

public class MyListbt<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyListbt() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyListbt(int capacity) {
        this.size = capacity;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = element;
        size++;
    }

    public void add(E element, int index) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        this.size++;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public int size() {
        return this.size;
    }

    public E[] clone() {
        return (E[]) elements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) return i;
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E[] get(int i) {

        return (E[]) elements[i];
    }

    public void clear() {
        elements = null;
        size = 0;
    }
}
