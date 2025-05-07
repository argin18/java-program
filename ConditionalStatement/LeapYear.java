package ConditionalStatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any year");
        int y = obj.nextInt();
        if (y % 400 == 0 || y % 4 == 0) {
            System.out.println(y + " is a Leap year.");
        } else if (y % 100 == 0) {
            System.out.println(y + " is not a Leap year.");
        } else {
            System.out.println(y + " is not a Leap year.");
        }
    }
}
