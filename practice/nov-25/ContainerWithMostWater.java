/** Two-pointer solution for the maximum water container area. */
public class ContainerWithMostWater {
    public static int maxArea(int[] heights) {
        if (heights == null) throw new IllegalArgumentException("heights must not be null");
        int left = 0, right = heights.length - 1, best = 0;
        while (left < right) {
            if (heights[left] < 0 || heights[right] < 0) {
                throw new IllegalArgumentException("Heights must be non-negative");
            }
            best = Math.max(best, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] <= heights[right]) left++;
            else right--;
        }
        return best;
    }

    public static void main(String[] args) {
        if (maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}) != 49) {
            throw new AssertionError("Container area check failed");
        }
        System.out.println("ContainerWithMostWater checks passed");
    }
}