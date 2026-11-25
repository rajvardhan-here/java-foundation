/** Levenshtein distance using O(min(m,n)) auxiliary space. */
public class EditDistance {
    public static int distance(String first, String second) {
        if (first == null || second == null) throw new IllegalArgumentException("Inputs cannot be null");
        if (second.length() > first.length()) return distance(second, first);
        int[] previous = new int[second.length() + 1];
        for (int j = 0; j <= second.length(); j++) previous[j] = j;
        for (int i = 1; i <= first.length(); i++) {
            int[] current = new int[second.length() + 1];
            current[0] = i;
            for (int j = 1; j <= second.length(); j++) {
                int cost = first.charAt(i - 1) == second.charAt(j - 1) ? 0 : 1;
                current[j] = Math.min(Math.min(current[j - 1] + 1, previous[j] + 1),
                        previous[j - 1] + cost);
            }
            previous = current;
        }
        return previous[second.length()];
    }

    public static void main(String[] args) {
        if (distance("horse", "ros") != 3 || distance("intention", "execution") != 5) {
            throw new AssertionError("Edit distance checks failed");
        }
        System.out.println("EditDistance checks passed");
    }
}