public class Main {
    public static void main(String[] args) {
        boolean teste = isPerfectNumber(6);
        System.out.println(teste);
    }

    public static boolean isPerfectNumber (int number) {
        if (number < 1) return false;

        int sumVerifier = 0;

        for (int factorial = 1; factorial <= (number/2); factorial++) {
            if(number % factorial == 0) {
                sumVerifier +=factorial;
            }
        }

        return (sumVerifier == number) ;
    }

}