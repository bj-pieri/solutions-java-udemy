public class Main {
    public static void main(String[] args) {
       int number = 5;
       int finalNumber = 20;
       int evenCounter = 0;
       int oddCounter = 0;
        while (number <= finalNumber) {
            if(isEvenNumber(number)) {
                System.out.println(number);
                evenCounter++;
            }
            if(!isEvenNumber(number)) {
               oddCounter++;
            }
            if(evenCounter >=5){
                break;
            }
            number++;
        }
        System.out.println("total even numbers are: " + evenCounter);
        System.out.println("total odd numbers are: " + oddCounter);
    }

    public static boolean isEvenNumber(int number) {
        if(number < 0 || (number % 2 != 0)) {
            return false;
        } else {
            return true;
        }
    }

}