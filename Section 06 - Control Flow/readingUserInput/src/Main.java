import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readUserInput();
    }

    public static void readUserInput () {
       int count = 1;
       double sum = 0;

       while (count <= 5) {

           System.out.println("Please enter #" + count);

           Scanner numberIn = new Scanner(System.in);
           String nextNumber = numberIn.nextLine();

           try {
//               int number = Integer.parseInt(nextNumber);
               double number = Double.parseDouble(nextNumber);
               System.out.println("You typed: " + number);
               count++;
               sum += number;
           } catch (NumberFormatException nfe) {
               System.out.println("Invalid Number");
               System.out.println("Type a positive valid number please YOU BAD MOTHERFUCKER!");
           }
       }
       System.out.println("the total sum is: " + sum);
    }
}