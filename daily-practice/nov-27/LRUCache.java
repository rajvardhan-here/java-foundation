import java.util.*;
/** Least-recently-used integer cache built on LinkedHashMap. */
public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer,Integer> map;
    public LRUCache(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Negative capacity");
        this.capacity = capacity;
        map = new LinkedHashMap<Integer,Integer>(16, 0.75f, true) {
            @Override protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }
    public int get(int key) { return map.getOrDefault(key, -1); }
    public void put(int key, int value) { if (capacity > 0) map.put(key, value); }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1); cache.put(2, 2); cache.get(1); cache.put(3, 3);
        System.out.println(cache.get(2)); // -1
    }
}