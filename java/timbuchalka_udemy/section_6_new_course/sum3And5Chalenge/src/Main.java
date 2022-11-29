public class Main {
    public static void main(String[] args) {
    int loopCounting = 0;
    int sum = 0;
    for(int loopNumber = 0; loopNumber <=1000;loopNumber++) {
        if (((loopNumber % 3) == 0) && ((loopNumber % 5) == 0)) {
            if (loopCounting > 5) {
                break;
            } else {
                sum = sum + loopNumber;
                System.out.println("the number is: " + loopNumber + " the sum is: " + sum);
                loopCounting++;
            }
        }
    }
}
}