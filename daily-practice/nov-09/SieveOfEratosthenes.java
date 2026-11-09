import java.util.ArrayList;
import java.util.List;

/** Generates every prime number up to and including the given limit. */
public class SieveOfEratosthenes {
    public static List<Integer> primesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();
        if (limit < 2) return primes;

        boolean[] composite = new boolean[limit + 1];
        for (int number = 2; number <= limit / number; number++) {
            if (!composite[number]) {
                for (int multiple = number * number; multiple <= limit; multiple += number) {
                    composite[multiple] = true;
                }
            }
        }

        for (int number = 2; number <= limit; number++) {
            if (!composite[number]) primes.add(number);
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(primesUpTo(30));
    }
}
