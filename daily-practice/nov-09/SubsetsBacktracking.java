import java.util.ArrayList;
import java.util.List;

/** Generates the power set; input values should be distinct. */
public class SubsetsBacktracking {
    public static List<List<Integer>> generate(int[] values) {
        List<List<Integer>> result = new ArrayList<>();
        if (values == null) return result;
        build(values, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private static void build(int[] values, int index, List<Integer> current,
                              List<List<Integer>> result) {
        if (index == values.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        build(values, index + 1, current, result);
        current.add(values[index]);
        build(values, index + 1, current, result);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(generate(new int[]{1, 2, 3}));
    }
}
