
import java.util.*;

public class prefixsum {
    public static void kadnane(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        System.out.println(ms);
    }

    public static void main(String args[]) {
        int num[] = {-2, -3, -5, 1, 4, -2, -2, 1, -11};
        kadnane(num);
    }
}
