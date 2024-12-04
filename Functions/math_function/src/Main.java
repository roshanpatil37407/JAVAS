public class Main {
    public static void main(String[] args) {
        int absInt = Math.abs(-10);
        double absDouble = Math.abs(-3.14);
        System.out.println("Absolute value (int): " + absInt);
        System.out.println("Absolute value (double): " + absDouble);

        int max = Math.max(10, 20);
        int min = Math.min(10, 20);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        double power = Math.pow(2, 3);
        double sqrt = Math.sqrt(16);
        System.out.println("2^3: " + power);
        System.out.println("Square root of 16: " + sqrt);

        double round = Math.round(3.6);
        double floor = Math.floor(3.6);
        double ceil = Math.ceil(3.4);
        System.out.println("Rounded: " + round);
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);

        double sin = Math.sin(Math.toRadians(30));
        double cos = Math.cos(Math.toRadians(60));
        double tan = Math.tan(Math.toRadians(45));
        System.out.println("Sin(30°): " + sin);
        System.out.println("Cos(60°): " + cos);
        System.out.println("Tan(45°): " + tan);

        double log = Math.log(10);
        double log10 = Math.log10(100);
        System.out.println("Log(10): " + log);
        System.out.println("Log10(100): " + log10);

        double random = Math.random();
        System.out.println("Random number: " + random);

        double exp = Math.exp(1);
        System.out.println("e^1: " + exp);

        double hypotenuse = Math.hypot(3, 4);
        System.out.println("Hypotenuse: " + hypotenuse);

        System.out.println("Signum of -10: " + Math.signum(-10));
        System.out.println("Signum of 0: " + Math.signum(0));
        System.out.println("Signum of 10: " + Math.signum(10));

        double cbrt = Math.cbrt(27);
        System.out.println("Cube root of 27: " + cbrt);
    }
}
