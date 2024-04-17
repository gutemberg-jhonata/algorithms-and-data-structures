package stack.impl;

import java.util.ArrayList;
import java.util.List;

public class IntStack {
    
    private List<Integer> arr;

    public IntStack() {
        arr = new ArrayList<>();
    }

    public void push(int val) {
        arr.add(val);
    }

    public int pop() {
        return arr.removeLast();
    }

    public int peek() {
        if (arr.size() == 0) {
            return -1;
        }
        return arr.get(arr.size() - 1);
    }

}
