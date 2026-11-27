/** Computes trapped rain water with two pointers and O(1) extra space. */
public class TrappingRainWater {
    public static int trapped(int[] height) {
        int left=0,right=height.length-1,leftMax=0,rightMax=0,total=0;
        while(left<right) {
            if(height[left]<=height[right]) {
                leftMax=Math.max(leftMax,height[left]); total+=leftMax-height[left++];
            } else {
                rightMax=Math.max(rightMax,height[right]); total+=rightMax-height[right--];
            }
        }
        return total;
    }
    public static void main(String[] args) { System.out.println(trapped(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6 }
}