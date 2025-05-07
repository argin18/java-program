package ConditionalStatement;

import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        double a, b, c, d, root1, root2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the coefficent of quadratic equation");
        a = obj.nextDouble();
        b = obj.nextDouble();
        c = obj.nextDouble();
        d = b * b - 4 * a * c;
        if (d == 0) {
            System.out.println("Root are real and Equals.");
            root1 = -b / (2 * a);
            root2 = root1;
            System.out.println("Root are " + root1 + " and " + root2);
        } else if (d > 0) {
            System.out.println("Root aree real but unreals.");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root are " + root1 + " and " + root2);
        } else {
            System.out.println("Root are imaginary and unreals.");
            root1 = -b / (2 * a);
            root2 = Math.sqrt(d) / (2 * a);
            System.out.printf("Roots are %f+%f and %f-%f", root1, root2, root1, root2);
        }
    }
}
