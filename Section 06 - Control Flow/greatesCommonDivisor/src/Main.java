public class Main {
    public static void main(String[] args) {
        int test = getGreatestCommonDivisor(250, 120);
        System.out.println(test);
    }

    public static int getGreatestCommonDivisor (int number1, int number2) {
        if (number1 < 10 || number2 < 10) return -1;

        while (number1 != number2) {
            if (number1 > number2) number1 -= number2;
            else number2 -= number1;
        }
        return number1;
    }
}