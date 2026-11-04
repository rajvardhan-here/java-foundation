import java.util.HashMap;
import java.util.Map;
public class FrequencyCounter {
 public static Map<Integer,Integer> count(int[] a){Map<Integer,Integer> f=new HashMap<>();for(int x:a)f.put(x,f.getOrDefault(x,0)+1);return f;}
 public static void main(String[] args){System.out.println(count(new int[]{1,2,2,3,3,3}));}
}