public class Main {
    public static void main(String[] args) {
        printEqual(1, 2, 1);
    }
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printEqual (int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && c != a) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}