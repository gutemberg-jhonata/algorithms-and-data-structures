package dynamicarrays.impl;

import dynamicarrays.DynamicArray;
import staticarrays.StaticArray;
import staticarrays.impl.StaticArrayImpl2;

public class DynamicArrayImpl2<T> implements DynamicArray<T> {
    private int capacity;
    private StaticArray<T> arr;

    public DynamicArrayImpl2() {
        capacity = 5;
        arr = new StaticArrayImpl2<>(capacity);
    }

    @Override
    public T get(int index) throws Exception {
        return arr.get(index);
    }

    @Override
    public void set(int index, T val) throws Exception {
        arr.set(index, val);
    }

    @Override
    public void insert(T val) throws Exception {
        if (arr.length() == capacity) {
            resize();
        }
        arr.insert(val);    
    }

    @Override
    public void insert(T val, int index) throws Exception {
        if (arr.length() == capacity) {
            resize();
        }
        arr.insert(val, index);
    }

    @Override
    public T remove() throws Exception {
        return arr.remove();
    }

    @Override
    public T remove(int index) throws Exception {
        return arr.remove(index);    
    }

    @Override
    public void print() {
        arr.print();
    }

    @Override
    public int length() {
        return arr.length();
    }

    @Override
    public int capacity() {
        return this.capacity;
    }
    
    private void resize() throws Exception {
        capacity *= 2;
        StaticArray<T> newArr = new StaticArrayImpl2<>(capacity);
        for (int i = 0; i < arr.length(); i++) {
            newArr.insert(arr.get(i));
        }
        arr = newArr;
    }
}
