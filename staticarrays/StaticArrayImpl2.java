package staticarrays;

public class StaticArrayImpl2<T> implements StaticArray<T> {
    private int capacity;
    private int length;
    private Object[] arr;

    public StaticArrayImpl2(final int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
    }
    
    public void insert(final T val) throws Exception {
        if (length == capacity) {
            throw new Exception("Capacity exceded.");
        }
        arr[length++] = val;
    }

    public void insert(final T val, final int index) throws Exception {
        if (length == capacity) {
            throw new Exception("Capacity exceded.");
        }
        if (index < 0 || index > length) {
            throw new Exception("Index out of bounds.");
        }
        for (int i = length - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = val;
        length++;
    }

    public void remove() {
        if (length > 0) {
            length--;
        }
    }

    public void remove(final int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        for (int i = index + 1; i < length; i++) {
            arr[i - 1] = arr[i];
        }
        if (length > 0) {
            length--;
        }
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int length() {
        return this.length;
    }
}
