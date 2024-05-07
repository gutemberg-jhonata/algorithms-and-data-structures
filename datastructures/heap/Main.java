package heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        var heap = new Heap();
        System.out.println(heap.getArray());
        heap.heapify(new ArrayList<>(Arrays.asList(30, 65, 19, 16, 14, 21, 68, 36, 19)));
        System.out.println(heap.getArray());
        heap.pop();
        System.out.println(heap.getArray());
        heap.pop();
        System.out.println(heap.getArray());
        heap.pop();
        System.out.println(heap.getArray());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }

}
