public class Main {
    public static void main(String[] args) {
       boolean teste = isPalindrome(1221);
        System.out.println(teste);
    }

    public static boolean isPalindrome (int number) {
        int reversedNumber = 0;
        int remainder = 0;
        int originalNumber = number;

        while (number !=0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }
}