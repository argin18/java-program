import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = obj.nextInt();
        if (n == 1 || n == 0) {
            System.out.println(n + " is neither prime not composite");
        } else if (n < 0) {
            System.out.println(n + " is a Negative number & Negative numbers are neither prime nor composite.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is a composite number.");
            }
        }
    }
}
