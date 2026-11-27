import java.util.*;
/** For each day, finds how many days until a warmer temperature. */
public class DailyTemperatures {
    public static int[] waitDays(int[] temperatures) {
        int n=temperatures.length; int[] answer=new int[n], stack=new int[n]; int top=0;
        for(int i=0;i<n;i++) {
            while(top>0 && temperatures[i]>temperatures[stack[top-1]]) {
                int day=stack[--top]; answer[day]=i-day;
            }
            stack[top++]=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(waitDays(new int[]{73,74,75,71,69,72,76,73}))); // [1, 1, 4, 2, 1, 1, 0, 0]
    }
}