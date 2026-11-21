import java.util.*;

public class PalindromePartitioning {
    static List<List<String>> partition(String text) {
        List<List<String>> result = new ArrayList<>();
        backtrack(text, 0, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(String s, int start, List<String> path, List<List<String>> out) {
        if (start == s.length()) { out.add(new ArrayList<>(path)); return; }
        for (int end = start; end < s.length(); end++) {
            if (!isPalindrome(s, start, end)) continue;
            path.add(s.substring(start, end + 1));
            backtrack(s, end + 1, path, out);
            path.remove(path.size() - 1);
        }
    }
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) if (s.charAt(left++) != s.charAt(right--)) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
}