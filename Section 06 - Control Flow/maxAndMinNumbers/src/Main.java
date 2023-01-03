import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax () {
        Scanner scan = new Scanner(System.in);
        double maxNumber = 0;
        double minNumber = 0;

        while (true) {
            System.out.println("Insert a valid number, characters are now alowed.");

            try {
                String number = scan.nextLine();
                double verifyNumber = Double.parseDouble(number);

                if (verifyNumber > maxNumber) maxNumber = verifyNumber;
                if (minNumber == 0 || verifyNumber < minNumber) minNumber = verifyNumber;

            } catch (NumberFormatException ex) {
                System.out.println("The max number is: " + maxNumber + " and the min number is: " + minNumber);
                break;
            }
        }
    }
}