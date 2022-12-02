public class Main {
    public static void main(String[] args) {
        printFactors(12);
    }

    public static void printFactors(int number) {
        if (number < 0) System.out.println("Invalid Value");

        for(int looper = 1;looper <= number; looper++) {
            int factorial = looper;
            if (number % factorial == 0 ) System.out.println(factorial);
        }
    }
}