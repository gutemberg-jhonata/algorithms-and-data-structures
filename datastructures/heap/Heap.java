package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    
    private List<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void push(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        while (i > 1 && heap.get(i) < heap.get(i/2)) {
            int tmp = heap.get(i);
            heap.set(i, heap.get(i/2));
            heap.set(i/2, tmp);
            i = i / 2;
        }
    }

    public int pop() {
        if (heap.size() == 1) {
            return -1;
        }
        if (heap.size() == 2) {
            return heap.removeLast();
        }
        int result = heap.get(1);
        heap.set(1, heap.removeLast());
        int i = 1;
        while (2 * i < heap.size()) {
            if (2 * i + 1 < heap.size() && 
            heap.get(2 * i + 1) < heap.get(2 * i) && 
            heap.get(i) > heap.get(2 * i + 1)) {
                var tmp = heap.get(i);
                heap.set(i, heap.get(2 * i + 1));
                heap.set(2 * i + 1, tmp);
                i = 2 * i + 1;
            } else if (heap.get(i) > heap.get(2 * i)) {
                var tmp = heap.get(i);
                heap.set(i, heap.get(2 * i));
                heap.set(2 * i, tmp);
                i = 2 * i;
            } else {
                break;
            }
        }
        return result;
    }

    public List<Integer> getArray() {
        return heap;
    }

}
