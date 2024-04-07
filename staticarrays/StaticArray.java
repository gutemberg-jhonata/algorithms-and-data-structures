package staticarrays;

public interface StaticArray<T> {
    T get(int index) throws Exception;
    void set(int index, T val) throws Exception;
    void insert(T val) throws Exception;
    void insert(T val, int index) throws Exception;
    T remove() throws Exception;
    T remove(int index) throws Exception;
    void print();
    int length();
}
