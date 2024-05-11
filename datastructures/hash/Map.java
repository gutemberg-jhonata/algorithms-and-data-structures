package hash;

public interface Map {
    String get(String key);
    void put(String key, String val);
    void remove(String key);
    void print();
}
