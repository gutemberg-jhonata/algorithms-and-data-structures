package queue;

import queue.impl.QueueImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new QueueImpl<>();
        queue.print();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(50);
        queue.enqueue(60);
        queue.dequeue();
        queue.enqueue(70);
        queue.print();
    }
}
