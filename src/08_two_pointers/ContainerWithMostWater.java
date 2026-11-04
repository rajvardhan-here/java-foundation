public class ContainerWithMostWater {
    public static long maxArea(int[] height) {
        int left = 0, right = height.length - 1; long best = 0;
        while (left < right) {
            long area = (long) Math.min(height[left], height[right]) * (right - left);
            best = Math.max(best, area);
            if (height[left] < height[right]) left++; else right--;
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}