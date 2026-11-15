public class Day13_Fibonacci {
    static void print(int count) {
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a + (i + 1 == count ? "\\n" : " "));
            int next = a + b; a = b; b = next;
        }
    }
    public static void main(String[] args) {
        print(10);
    }
}