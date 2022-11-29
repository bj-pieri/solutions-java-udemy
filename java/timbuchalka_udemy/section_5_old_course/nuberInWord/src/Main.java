public class Main {
    public static void main(String[] args) {
        printNumberInWord(2);
    }
    public static void printNumberInWord (int number) {
        String word_returned = "OTHER";

        switch (number){
            case 0:
                word_returned = "ZERO";
                break;
            case 1:
                word_returned = "ONE";
                break;
            case 2:
                word_returned = "TWO";
                break;
            case 3:
                word_returned = "THREE";
                break;
            case 4:
                word_returned = "FOUR";
                break;
            case 5:
                word_returned = "FIVE";
                break;
            case 6:
                word_returned = "SIX";
                break;
            case 7:
                word_returned = "SEVEN";
                break;
            case 8:
                word_returned = "EIGHT";
                break;
            case 9:
                word_returned = "NINE";
                break;
        }
        System.out.println(word_returned);

    }
}