package recursion;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        if (num < 0) {
            System.out.println("Factorial is not defined for negative number.");
        } else {
            System.out.println("Factorial of " + num + " is " + fact(num));
        }
    }
}
