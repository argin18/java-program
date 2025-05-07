import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any natural Number: ");
        n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " number is: " + sum);
    }
}
