import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a, b, rem;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any two  numbers:");
        a = obj.nextInt();
        b = obj.nextInt();
        do {
            rem = a % b;
            a = b;
            b = rem;
        } while (rem != 0);
        System.out.println("GCD of two numbers is: " + a);
        obj.close();
        
    }
}
