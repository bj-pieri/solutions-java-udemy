import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int loopCount = 0;

        while (true) {

            try {
                String number = scanner.nextLine();
                int digitNumber = Integer.parseInt(number);
                sum += digitNumber;
                loopCount++;
            } catch (NumberFormatException nfe) {
                average = Math.round((double)sum / loopCount);
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}