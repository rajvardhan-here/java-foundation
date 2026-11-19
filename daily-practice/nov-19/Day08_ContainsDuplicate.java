import java.util.HashSet;
import java.util.Set;
public class Day08_ContainsDuplicate {
    public static boolean containsDuplicate(int[] values) {
        Set<Integer> seen = new HashSet<>();
        for (int value : values) if (!seen.add(value)) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); // true
    }
}