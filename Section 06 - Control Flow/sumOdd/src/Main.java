public class Main {
    public static void main(String[] args) {
        int starter = sumOdd(1, 100);
        System.out.println(starter);
    }

    public static boolean isOdd (int number) {
        if (number < 0 ) {
            return false;
        } else {
            if (number % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
        if ((start < 0) || (start > end) || (end < 0)) {
            return -1;
        }

        for(int loopNumber = start; loopNumber <= end; loopNumber++) {
            if (isOdd(loopNumber) == true) {
                sum += loopNumber;
            }
        }
        return sum;
    }
    }