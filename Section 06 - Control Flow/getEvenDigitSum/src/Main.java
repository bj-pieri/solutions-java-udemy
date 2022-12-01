public class Main {
    public static void main(String[] args) {
        int teste = getEvenDigitSum(123456789);
        System.out.println(teste);
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int evenNumbersSum = 0;
        int remainder = 0;

        while (number > 0 ) {
            remainder = number % 10;

            if ((remainder % 2) == 0) {
                evenNumbersSum = evenNumbersSum + remainder;
            }
            number /= 10;
        }
        return evenNumbersSum;
    }
}