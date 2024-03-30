package stack;

import dynamicarrays.DynamicArray;

public class Stack {
    private final DynamicArray stack;

    public Stack() {
        stack =  new DynamicArray(5);
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
