public class Main {
    public static void main(String[] args) {
        int teste = getDigitCount(0);
        System.out.println(teste);
    }
private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
   public static void numberToWords (int toWordNumber) {
       if (toWordNumber < 0) System.out.println(INVALID_VALUE_MESSAGE);

       int count = getDigitCount(toWordNumber);
       int unreversedToWordNumber = reverse(toWordNumber);
       int loopNumber = 0;

       for (int i = 0; i < count; i++) {
           loopNumber = unreversedToWordNumber % 10;
           switch (loopNumber) {
               case 0:
                   System.out.print("Zero "); break;
               case 1:
                   System.out.print("One "); break;
               case 2:
                   System.out.print("Two "); break;
               case 3:
                   System.out.print("Three "); break;
               case 4:
                   System.out.print("Four "); break;
               case 5:
                   System.out.print("Five "); break;
               case 6:
                   System.out.print("Six "); break;
               case 7:
                   System.out.print("Seven "); break;
               case 8:
                   System.out.print("Eight "); break;
               case 9:
                   System.out.print("Nine "); break;
               default: break;
           }
           unreversedToWordNumber /= 10;
       }
   }

   public static int reverse (int toReverseNumber) {
        int remainder, reversedNumber = 0;

        while (toReverseNumber !=0) {
            remainder = toReverseNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            toReverseNumber /= 10;
        }
        return reversedNumber;
   }

   public static int getDigitCount (int getNumber) {
        if (getNumber < 0) return -1;
        int count = 0;


        do {
            getNumber /= 10;
            count++;
        } while (getNumber != 0);
        return count;
   }
}