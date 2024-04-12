package queue;

public interface Queue<T> {
    void enqueue(T val);
    T dequeue() throws Exception;
    void print();
}
