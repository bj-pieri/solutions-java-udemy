public class Main {
    public static void main(String[] args) {
        boolean cat = isCatPlaying(true, 33);
        System.out.println(cat);
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && (temperature >=25 && temperature <=45)){
            return true;
        } else if (!summer && (temperature >=25 && temperature <=35)) {
            return true;
        }else {
            return false;
        }
    }
}