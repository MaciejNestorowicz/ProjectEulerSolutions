public class LargestPrimeFactor {
    public static Long largestPrimeFactor(Long number) {
        if (number <= 1) return 0L;
        Long a = 2L;
        while (a <= number) {
            if (number % a == 0) {
                number /= a;
            } else {
                a++;
            }
        }
        return a;
    }
}
