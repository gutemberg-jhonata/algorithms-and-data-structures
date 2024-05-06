package heap;

public class Main {
    
    public static void main(String[] args) {
        var heap = new Heap();
        System.out.println(heap.getArray());
        heap.push(30);
        System.out.println(heap.getArray());
        heap.push(65);
        System.out.println(heap.getArray());
        heap.push(19);
        System.out.println(heap.getArray());
        heap.push(16);
        System.out.println(heap.getArray());
        heap.push(14);
        System.out.println(heap.getArray());
        heap.push(21);
        System.out.println(heap.getArray());
        heap.push(68);
        System.out.println(heap.getArray());
        heap.push(26);
        System.out.println(heap.getArray());
        heap.push(19);
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
