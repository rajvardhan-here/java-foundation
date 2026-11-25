import java.util.ArrayList;
import java.util.List;

/** Generates all permutations of an array of distinct integers. */
public class Permutations {
    public static List<List<Integer>> generate(int[] values) {
        if (values == null) throw new IllegalArgumentException("values must not be null");
        List<List<Integer>> result = new ArrayList<>();
        backtrack(values, new boolean[values.length], new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] values, boolean[] used, List<Integer> path,
                                  List<List<Integer>> result) {
        if (path.size() == values.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < values.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(values[i]);
            backtrack(values, used, path, result);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        if (generate(new int[]{1, 2, 3}).size() != 6
                || generate(new int[]{}).size() != 1) {
            throw new AssertionError("Permutation checks failed");
        }
        System.out.println("Permutations checks passed");
    }
}