package stack.impl;

import dynamicarrays.DynamicArray;
import dynamicarrays.impl.DynamicArrayImpl2;
import stack.Stack;

public class StackImpl2<T> implements Stack<T> {
    private DynamicArray<T> arr;

    public StackImpl2() {
        arr = new DynamicArrayImpl2<>();
    }

    @Override
    public void push(final T val) throws Exception {
        arr.insert(val);
    }

    @Override
    public T pop() throws Exception {
        return arr.remove();    
    }

    @Override
    public T peek() throws Exception {
        return arr.get(arr.length() - 1);
    }
}
