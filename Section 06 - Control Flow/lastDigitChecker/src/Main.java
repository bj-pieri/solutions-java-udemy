public class Main {
    public static void main(String[] args) {
        boolean b = hasSameLastDigit(12, 46, 49);
        System.out.println(b);
    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;

        if (lastDigit1 == lastDigit2) return true;
        if (lastDigit2 == lastDigit3) return true;
        if (lastDigit1 == lastDigit3) return true;
        return false;
    }

    public static boolean isValid (int number) {
        if (number < 10 || number > 1000) {
            return false;
        } return true;
    }
}