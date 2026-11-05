import java.util.Scanner;

public class primenumber {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        // Checking odd divisors only keeps the loop efficient.
        for (int divisor = 3; divisor <= n / divisor; divisor += 2) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        for (int number = 2; number <= n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        primeinrange(n);
        sc.close();
    }
}
