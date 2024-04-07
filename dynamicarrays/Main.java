package dynamicarrays;

import dynamicarrays.impl.DynamicArrayImpl2;

public class Main {
    public static void main(String[] args) throws Exception {
        DynamicArray<Integer> arr = new DynamicArrayImpl2<>();
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.print();
        arr.insert(60);
        arr.print();
        arr.insert(25, 2);
        arr.print();
        arr.insert(35, 4);
        arr.print();
        arr.remove(3);
        arr.print();
        arr.remove(6);
        arr.print();
        arr.remove(0);
        arr.print();
    }
}
