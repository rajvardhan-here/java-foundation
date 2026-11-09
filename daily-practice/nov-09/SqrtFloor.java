/** Computes floor(sqrt(value)) without multiplication overflow. */
public class SqrtFloor {
    public static int sqrt(int value) {
        if (value < 0) throw new IllegalArgumentException("Value must be non-negative");

        int left = 0;
        int right = Math.min(value, 46340);
        int answer = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle == 0 || middle <= value / middle) {
                answer = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(25)); // 5
        System.out.println(sqrt(27)); // 5
        System.out.println(sqrt(0));  // 0
    }
}
