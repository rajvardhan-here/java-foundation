import java.util.*;

public class bruteforce{
    public static int maxSubArray(int[] nums) {

        int current = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                current = 0;

                for (int k = i; k <= j; k++) {
                    current += nums[k];
                }

                if (current > maxSum) {
                    maxSum = current;
                }
            }
        }

        return maxSum;
    }

    public static void main(String argsp[]){
        int nums[] = {-2,3,1,-1,3};

        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
}
