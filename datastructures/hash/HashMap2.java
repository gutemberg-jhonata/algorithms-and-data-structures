package hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap2 {
    private int capacity;
    private int size;
    private List<List<Pair>> map;

    private class Pair {
        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashMap2() {
        capacity = 2;
        map = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            map.add(new LinkedList<>());
        }
        size = 0;
    }
    
    public void put(int key, int value) {
        int index = key % capacity;
        for (int i = 0; i < map.get(index).size(); i++) {
            if (map.get(index).get(i).key == key) {
                map.get(index).get(i).value = value;
                return;
            }
        }
        map.get(index).add(new Pair(key, value));
        size++;
        if (size >= capacity) {
            rehash();
        }
    }
    
    public int get(int key) {
        int index = key % capacity;
        for (int i = 0; i < map.get(index).size(); i++) {
            if (map.get(index).get(i).key == key) {
                return map.get(index).get(i).value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key % capacity;
        for (int i = 0; i < map.get(index).size(); i++) {
            if (map.get(index).get(i).key == key) {
                map.get(index).remove(i);
                size--;
                return;
            }
        }
    }

    private void rehash() {
        capacity *= 2;
        List<List<Pair>> newMap = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            newMap.add(new LinkedList<>());
        }
        List<List<Pair>> oldMap = map;
        map = newMap;
        size = 0;
        for (List<Pair> linkedList: oldMap) {
            for (Pair pair: linkedList) {
                put(pair.key, pair.value);
            }
        }
    }
}
