public class Main {
    public static void main(String[] args) {
        int teste = getLargestPrime(217);
        System.out.println(teste);
    }

    public static int getLargestPrime (int number) {
        if (number < 2 ) return -1;

        for (int i = 2; i <= (number/2); i++) {
            if (number % i == 0) {
                number/= i;
                i--;
            }
        } return number;

    }
}