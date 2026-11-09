/** Counts one-bits in the 32-bit representation of an integer. */
public class CountSetBits {
    public static int count(int value) {
        int bits = 0;
        while (value != 0) {
            value &= value - 1;
            bits++;
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(count(13)); // 3 (1101)
        System.out.println(count(-1)); // 32
    }
}
