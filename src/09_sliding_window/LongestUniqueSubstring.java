import java.util.*;
public class LongestUniqueSubstring {
 public static int lengthOfLongest(String s){
  Map<Character,Integer> last=new HashMap<>();int left=0,best=0;
  for(int right=0;right<s.length();right++){char ch=s.charAt(right);if(last.containsKey(ch))left=Math.max(left,last.get(ch)+1);last.put(ch,right);best=Math.max(best,right-left+1);}
  return best;
 }
 public static void main(String[] args){System.out.println(lengthOfLongest("abcabcbb"));}
}