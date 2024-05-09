package bst.map;

import java.util.List;

public interface Map {
    void insert(int key, int val);
    int get(int key);
    int getMin();
    int getMax();
    void remove(int key);
    List<Integer> getInorderKeys();
}
