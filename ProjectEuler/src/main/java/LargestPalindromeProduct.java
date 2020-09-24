public class LargestPalindromeProduct {
    public static int largestPalindromeProduct() {
        int max = -1;
        int temp;
        for (int i = 999 ; i >= 100 ; i--) {
            for (int j = 999 ; j >= 100 ; j--) {
                temp = i * j;
                if ( max < temp && checkForPalindrome(temp) ) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static boolean checkForPalindrome(int n) {
        int reminder = 0;
        int rev = 0;
        int temp = n;
        while(temp > 0){
            reminder = temp % 10;
            rev = (rev*10) + reminder;
            temp /= 10;
        }
        return n == rev;
    }
}
