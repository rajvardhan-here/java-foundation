import java.util.*;

/** Least-recently-used cache with O(1) average get and put operations. */
public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative");
        this.capacity = capacity;
        cache = new LinkedHashMap<>(16, 0.75f, true);
    }

    public int get(int key) { return cache.getOrDefault(key, -1); }

    public void put(int key, int value) {
        if (capacity == 0) return;
        cache.put(key, value);
        if (cache.size() > capacity) {
            Iterator<Integer> iterator = cache.keySet().iterator();
            iterator.next();
            iterator.remove();
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 10); cache.put(2, 20);
        cache.get(1); cache.put(3, 30);
        System.out.println(cache.get(2)); // -1 (evicted)
        System.out.println(cache.get(3)); // 30
    }
}