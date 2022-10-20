public class Main {
// simple program that verifies if a dog owner should wake up with a bark earlier than 8 a.m. and later than 10 p.m (all with 24 hour format)
// the program should return false if the bark is between 8 a.m. and 10 p.m.
    public static void main(String[] args) {
        boolean wake = shouldWakeUp(true, 6);

        if (wake == true){
            System.out.println("WAKE UUUUUUUUUUUUUUUUP");
        } else {
            System.out.println("don't need to let Morpheus play alone kid");
        }
    }
    public static boolean shouldWakeUp (boolean bark, int hourOfDay) {
        boolean wakeUp = false;

        if (bark == false){
            wakeUp = false;
        } else if (hourOfDay < 0 || hourOfDay > 23 ) {
            wakeUp = false;
        } else if (hourOfDay < 8 || hourOfDay > 22){
            wakeUp = true;
        } else {
            wakeUp = false;
        }
        return wakeUp;
    }
}