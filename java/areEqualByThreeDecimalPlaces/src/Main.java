public class Main {
// simple program that checks equality between two double numbers with 3 decimal places without extern libraries
    public static void main(String[] args) {
        boolean test = areEqualByThreeDecimalPlaces(3.1446, 3.144);
        System.out.println(test);
    }
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {
        System.out.println(numberOne * 1000 + " " + numberTwo * 1000);
        return (int) (numberOne * 1000) == (int) (numberTwo * 1000);
    }
}