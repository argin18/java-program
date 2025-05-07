import java.util.Scanner;

public class SumOfSqr {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any Natural Number: ");
        n = obj.nextInt();
        for (double i = 1; i <= n; i++) {
            sum += (Math.pow(i, 2));
        }
        System.out.println("The sum of Squar of first " + n + " natural  number is: " + sum);
    }
}
