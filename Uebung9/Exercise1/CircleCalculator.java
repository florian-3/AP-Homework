package Uebung9.Exercise1;

public class CircleCalculator {
    public static void main(String[] args) {
        // --- Lambda Expressions ---
        // The lambda expressions implement the 'calculate' method of the Circle interface.
        // They include the check for a positive radius.

        // Lambda to calculate the diameter of the circle.
        Circle diameter = (radius) -> {
            if (radius > 0) {
                return 2 * radius;
            }
            return 0;
        };

        // Lambda to calculate the surface area of the circle (π * r^2).
        Circle surface = (radius)
                -> {
            if (radius > 0) {
                return Math.PI * radius * radius;
            }
            return 0;
        };

        // Lambda to calculate the circumference of the circle (2 * π * r).
        Circle circumference = (radius) -> {
            if (radius > 0) {
                return 2 * Math.PI * radius;
            }
            return 0;
        };

        // --- Examples and Printing ---
        System.out.println("--- Circle Calculations ---");

        double testRadius1 = 10.0;
        System.out.println("Calculating for radius: " + testRadius1);
        System.out.printf("Diameter:      %.2f\n", diameter.calculate(testRadius1));
        System.out.printf("Surface Area:  %.2f\n", surface.calculate(testRadius1));
        System.out.printf("Circumference: %.2f\n\n", circumference.calculate(testRadius1));

        double testRadius2 = 5.5;
        System.out.println("Calculating for radius: " + testRadius2);
        System.out.printf("Diameter:      %.2f\n", diameter.calculate(testRadius2));
        System.out.printf("Surface Area:  %.2f\n", surface.calculate(testRadius2));
        System.out.printf("Circumference: %.2f\n\n", circumference.calculate(testRadius2));

        // Example with an invalid radius to test the condition.
        double invalidRadius = -5.0;
        System.out.println("Calculating for invalid radius: " + invalidRadius);
        System.out.printf("Diameter:      %.2f\n", diameter.calculate(invalidRadius));
        System.out.printf("Surface Area:  %.2f\n", surface.calculate(invalidRadius));
        System.out.printf("Circumference: %.2f\n", circumference.calculate(invalidRadius));
    }
}
