public class Day02_LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 37, c = 24;
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + largest);
    }
}