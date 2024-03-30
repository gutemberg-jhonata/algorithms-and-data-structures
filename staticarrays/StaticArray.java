package staticarrays;

public class StaticArray<T> {
    private final Object[] arr;
    private final int capacity;
    private int length = 0;

    public StaticArray(final int capacity) {
        arr = new Object[capacity];
        this.capacity = capacity;
    }

    public int lenght() {
        return this.length;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(final T element) throws Exception {
        if (length + 1 > capacity) {
            throw new Exception("Array capacity exceded");
        }
        arr[length] = element;
        length++;
    }

    public void insert(final T element, final int i) throws Exception {
        if (length == capacity) {
            throw new Exception("Array capacity exceded");
        }
        for (int index = length - 1; index >= i; index --) {
            arr[index + 1] = arr[index];
        }
        arr[i] = element;
        length++;
    }

    public void delete() {
        if (length > 0) {
            arr[length - 1] = null;
        }
        length--;
    }

    public void delete(final int i) {
        if (length > 0) {
            for (int index = i + 1; index < length; index++) {
                arr[index - 1] = arr[index];
            }
            length--;
        }
    }
}