public class Main {
// a simple program that converts KB in MB
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500); // write the value to be converted inside the parenthesis
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = kiloBytes / 1024;
            int kbRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + kbRemainder + " KB");
        }
    }
}