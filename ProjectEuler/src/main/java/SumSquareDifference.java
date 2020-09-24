public class SumSquareDifference {
    public static int sumSquareDifference() {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i*i;
            sum += i;
        }
        squareOfSum = sum*sum;

        return squareOfSum - sumOfSquares;
    }
}
