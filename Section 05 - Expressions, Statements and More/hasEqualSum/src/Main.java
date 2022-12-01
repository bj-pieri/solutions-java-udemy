public class Main {
// a simple program that receives 3 int parameters and check if the sum of the 2 firsts are equal to third one
    public static void main(String[] args) {
        boolean test = hasEqualSum(2, -2, 4);
        System.out.println(test);
    }
    public static boolean hasEqualSum(int n1, int n2, int n3) {
        return ((n1 + n2) == n3);
    }
}