package staticarrays.impl;

public class IntStaticArray {
    
    private int[] arr;
    private int capacity;
    private int length;

    public IntStaticArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        length = 0;
    }

    public int get(int index) {
        if (index < 0 || index > length -1) {
            return -1;
        }
        return arr[index];
    }

    public void set(int val, int index) throws Exception {
        if (index < 0 || index > length -1) {
            throw new Exception("index out of bounds");
        }
        arr[index] = val;
    }

    public void insert(int val) throws Exception {
        if (length == capacity) {
            throw new Exception("capacity exceded");
        }
        arr[length++] = val;
    }

    public void insert(int val, int index) throws Exception {
        if (length == capacity) {
            throw new Exception("capacity exceded");
        }
        if (index < 0 || index > length) {
            throw new Exception("index out of bounds");
        }
        for (int i = length - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = val;
        length++;
    }

    public int remove() {
        if (length == 0) {
            return -1;
        }
        return arr[--length];
    }

    public int remove(int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("index out of bounds");
        }
        int val = arr[index];
        for (int i = index + 1; i < length; i++) {
            arr[i - 1] = arr[i];
        }
        length--;
        return val;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return length;
    }

    public int capacity() {
        return capacity;
    }

}
