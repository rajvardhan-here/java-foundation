import java.util.*;
/** Checks whether a string can be segmented into dictionary words. */
public class WordBreak {
    public static boolean canBreak(String s,Set<String> dictionary) {
        boolean[] dp=new boolean[s.length()+1]; dp[0]=true;
        for(int end=1;end<=s.length();end++)
            for(int start=0;start<end;start++)
                if(dp[start] && dictionary.contains(s.substring(start,end))) { dp[end]=true; break; }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        System.out.println(canBreak("leetcode",new HashSet<>(Arrays.asList("leet","code")))); // true
    }
}