import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0, second = 1, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            // System.out.print(next + " ");
        }
    }
}
