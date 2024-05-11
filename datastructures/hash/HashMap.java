package hash;

public class HashMap implements Map {
    private int size;
    private int capacity;
    private Pair[] map;

    private class Pair {
        private String key;
        private String val;

        public Pair(String key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    public HashMap() {
        size = 0;
        capacity = 2;
        map = new Pair[capacity];
    }

    @Override
    public String get(String key) {
        int index = hash(key);
        while (map[index] != null) {
            if (map[index].key == key) {
                return map[index].val;
            }
            index++;
            index %= capacity;
        }
        return null;
    }

    @Override
    public void put(String key, String val) {
        int index = hash(key);
        while (true) {
            if (map[index] == null) {
                map[index] = new Pair(key, val);
                size++;
                if (size >= capacity / 2) {
                    rehash();
                }
                return;
            } else if (map[index].key == key) {
                map[index].val = val;
                return;
            }
            index++;
            index %= capacity;
        }
    }

    @Override
    public void remove(String key) {
        if (get(key) == null) {
            return;
        }
        int index = hash(key);
        while (true) {
            if (map[index].key == key) {
                map[index] = null;
                size--;
                return;
            }
            index++;
            index %= capacity;
        }
    }

    @Override
    public void print() {
        for (var pair: map) {
            if (pair != null) {
                System.out.println(pair.key + " " + pair.val);
            }
        }
    }

    private int hash(String key) {
        int index = 0;
        for (int c: key.toCharArray()) {
            index += c;
        }
        return index % capacity;
    }

    private void rehash() {
        capacity *= 2;
        var newMap = new Pair[capacity];
        var oldMap = map;
        map = newMap;
        size = 0;
        for (var pair: oldMap) {
            if (pair != null) {
                put(pair.key, pair.val);
            }
        }
    }
    
}
