public class SpecialPythagoreanTriplet {
    public static int specialPythagoreanTriplet() {
        int number = 1000;
        int product = 0;
        int c = 0;
        for (int i = 1; i < number/3; i++) {
            for (int j = i; j <= number/2; j++) {
                c = number - (i + j);
                if (i*i + j*j == c*c) {
                    product = i * j * c;
                    break;
                }
            }
        }
        return product;
    }
}
