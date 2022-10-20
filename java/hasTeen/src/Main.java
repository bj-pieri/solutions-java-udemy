public class Main {
// a simple program that calculate if the parameters given are in range of "teen numbers" [exercise of Java course by tim buchalka in udemy]
    public static void main(String[] args) {
        boolean test = hasTeen(12, 12, 19);
        System.out.println(test);
    }
    public static boolean hasTeen (int n1, int n2, int n3) {
        return ((n1 >= 13 && n1 <= 18) || (n2 >= 13 && n2 <= 18) || (n3 >= 13 && n3 <= 18));
    }

    public static boolean isTeen (int b1) {
         return ((b1 >= 13 && b1 <= 18));
    }
}