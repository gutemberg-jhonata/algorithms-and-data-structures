package hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap3 implements Map {
    private List<List<Pair>> map;
    private int capacity;
    private int size;

    private class Pair {
        private String key;
        private String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashMap3() {
        capacity = 10;
        map = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            map.add(new LinkedList<>());
        }
        size = 0;
    }

    @Override
    public String get(String key) {
        int index = hash(key);
        for (Pair pair: map.get(index)) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        return null;
    }

    @Override
    public void put(String key, String val) {
        int index = hash(key);
        for (Pair pair: map.get(index)) {
            if (pair.key == key) {
                pair.value = val;
                return;
            }
        }
        map.get(index).add(new Pair(key, val));
        size++;
        if (size >= capacity / 2) {
            rehash();
        }
    }

    @Override
    public void remove(String key) {
        int index = hash(key);
        for (int i = 0; i < map.get(index).size(); i++) {
            if (map.get(index).get(i).key == key) {
                map.get(index).remove(i);
                size--;
                return;
            }
        }
    }

    @Override
    public void print() {
        for (List<Pair> list: map) {
            for (Pair pair: list) {
                System.out.println(pair.key + " " + pair.value);
            }
        }
    }

    private int hash(String key) {
        int index = 0;
        for (char c: key.toCharArray()) {
            index += c;
        }
        return index % capacity;
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
        for (List<Pair> list: oldMap) {
            for (Pair pair: list) {
                put(pair.key, pair.value);
            }
        }
    }
    
}
