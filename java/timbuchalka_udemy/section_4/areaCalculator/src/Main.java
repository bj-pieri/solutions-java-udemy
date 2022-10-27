public class Main {
    public static void main(String[] args) {
        double areaCalc = area(5.0, 4.0);
        System.out.println(areaCalc);
    }
    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double circle = radius * radius * Math.PI;
            return circle;
        }
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        } else {
            double calc = x * y;
            return calc;
        }

    }
}