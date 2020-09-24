public class SummationOfPrimes {
    public static Long summationOfPrimes(int number) {
        Long sum = 0L;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) sum += (long) i;
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        int counter = 0;
        int sqrt = (int) Math.sqrt(number);

        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) counter++;
            if (counter > 1) return false;
        }
        return true;
    }
}
