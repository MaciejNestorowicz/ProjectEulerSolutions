public class EvenFibonacciNumbers {
    public static int evenFibonacciNumbers() {
        int a = 1;
        int b = 1;
        int c = 1;
        int sum = 0;
        while(c <= 4000000) {
            a = b;
            b = c;
            c = a+b;
            if(c % 2 == 0) {
                sum += c;
            }
        }
        return sum;
    }
}
