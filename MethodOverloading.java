public class MethodOverloading {

    // Method 1: Sum of two integers
    static int sum(int a, int b) {
        return a + b;
    }

    // Method 2: Sum of two double values
    static double sum(double a, double b) {
        return a + b;
    }

    // Method 3: Sum of three integers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // Integer values
        int x = 10;
        int y = 20;
        int z = 30;

        // Double values
        double a = 35.0;
        double b = 45.0;

        System.out.println("The sum: " + sum(x, y));
        System.out.println("The sum: " + sum(a, b));
        System.out.println("The sum: " + sum(x, y, z));
    }
}
