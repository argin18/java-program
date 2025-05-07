package ConditionalStatement;

import java.util.Scanner;

public class WeekName {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number from 1-7 for Week :");
        n = obj.nextInt();

        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Suturday");
                break;

            default:
                System.out.println("You entered invalid input !!");
        }
    }
}
