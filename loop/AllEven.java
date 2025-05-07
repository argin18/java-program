

import java.util.Scanner;

public class AllEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural number.");
        int n = sc.nextInt();

        // filtering all even number from user input.

       /* for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        } */


        // Sum of filtering all even number from user input.
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum +=i; 
        }
        System.out.println("Sum of even  number is: "+sum);
        sc.close();
    }
}
