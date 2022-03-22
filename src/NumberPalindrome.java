public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);

        int reverse = 0;
        int lastDigit = 0;
        int originalNumber = number;

        while (originalNumber > 0) {
            lastDigit = originalNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            originalNumber /= 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
