import java.util.*;
/** Largest rectangle area in a histogram in linear time. */
public class LargestRectangleHistogram {
    public static int maxArea(int[] heights) {
        int n=heights.length, best=0; Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<=n;i++) {
            int h=i==n?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > h) {
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                best=Math.max(best,height*width);
            }
            stack.push(i);
        }
        return best;
    }
    public static void main(String[] args) { System.out.println(maxArea(new int[]{2,1,5,6,2,3})); // 10 }
}