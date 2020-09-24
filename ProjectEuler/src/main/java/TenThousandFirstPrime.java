public class TenThousandFirstPrime {
    public static int tenThousandFirstPrime(int limit) {
        int counter = 1;
        int result = 1;

        for (int i = 2; counter <= limit; i++) {
            if (isPrime(i)) {
                result = i;
                counter++;
            }
        }
        return result;
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
