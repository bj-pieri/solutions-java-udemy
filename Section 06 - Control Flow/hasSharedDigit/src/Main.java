public class Main {
    public static void main(String[] args) {
        boolean b = hasSharedDigit(21, 92);
        System.out.println(b);
    }

    public static boolean hasSharedDigit (int number1, int number2) {
        if ((number1 > 99 || number1 < 10 ) || (number2 > 99 || number2 < 10)) {
            return false;
        }
        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int firstDigit1 = number1 /10;
        int firstDigit2 = number2 / 10;

        if (lastDigit1 == lastDigit2) return true;
        if (firstDigit1 == firstDigit2) return true;
        if (lastDigit1 == firstDigit2) return true;
        if (lastDigit2 == firstDigit1) return true;
        return false;

    }
}