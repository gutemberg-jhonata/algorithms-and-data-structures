class DynamicArray {

    private int[] arr;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        if (i < length) {
            return arr[i];
        }
        return -1;
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0) {
            return arr[--length];
        }
        return -1;
    }

    private void resize() {
        capacity *= 2;
        var newArr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
