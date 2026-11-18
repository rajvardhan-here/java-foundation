public class FibonacciSequence {
    public static void main(String[] args) {
        int count = 10;
        int first = 0, second = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(first + (i == count - 1 ? "\n" : " "));
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
