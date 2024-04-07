package staticarrays;

public interface StaticArray<T> {
    public void insert(final T val) throws Exception;
    public void insert(final T val, final int i) throws Exception;
    public void remove();
    public void remove(int i) throws Exception;
    public void print();
    public int length();
}
