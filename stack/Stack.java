package stack;

public interface Stack<T> {
    void push(T val) throws Exception;
    T pop() throws Exception;
    T peek() throws Exception;
}
