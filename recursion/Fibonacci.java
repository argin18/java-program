package recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci Series :");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i));
        }
    }
}
