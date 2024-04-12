package queue.impl;

import linkedlist.LinkedList;
import linkedlist.impl.SinglyLinkedList2;
import queue.Queue;

public class QueueImpl<T> implements Queue<T> {
    private LinkedList<T> queue;

    public QueueImpl() {
        queue = new SinglyLinkedList2<>();
    }

    @Override
    public void enqueue(final T val) {
        queue.insert(val);
    }

    @Override
    public T dequeue() throws Exception {
        return queue.remove(0);
    }

    @Override
    public void print() {
        queue.print();    
    }
    
}
