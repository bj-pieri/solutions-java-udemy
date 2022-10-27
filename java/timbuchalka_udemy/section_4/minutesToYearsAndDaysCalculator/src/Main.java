public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printYearsAndDays (long minutes) {
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;

        if (minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (days >= 365) {
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}