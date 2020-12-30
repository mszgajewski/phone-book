import java.util.Scanner;

public class Main {

    public static double pow(double a, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            // Negative power.
            if (a == 0) {
                throw new IllegalArgumentException(
                        "It's impossible to raise 0 to the power of a negative number");
            }
            return 1 / pow(a, -n);
        } else {
            // Positive power
            double powerOfHalfN = pow(a, n / 2);
            double[] factor = { 1, a };
            return factor[n % 2] * powerOfHalfN * powerOfHalfN;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}
