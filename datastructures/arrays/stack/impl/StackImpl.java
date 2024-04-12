package stack.impl;

import dynamicarrays.impl.DynamicArrayImpl;

public class StackImpl {
    private final DynamicArrayImpl stack;

    public StackImpl() {
        stack =  new DynamicArrayImpl(5);
    }
    
    public void push(int n) {
        stack.pushback(n);
    }

    public int pop() {
        return stack.popback();
    }

    public int peek() {
        if (stack.getSize() > 0) {
            return stack.get(stack.getSize() - 1);
        }
        return -1;
    }
}
