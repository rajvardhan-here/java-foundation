public class pr {

    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int raj(int n, int r) {
        int fact_1 = factorial(n);
        int fact_2 = factorial(r);
        int fact_3 = factorial(n - r);

        int bino = fact_1 / (fact_2 * fact_3);
        return bino;
    }

    public static void main(String[] args) {
        System.out.println(raj(5, 2)); // 10
    }
}