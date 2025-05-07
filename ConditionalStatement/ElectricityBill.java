package ConditionalStatement;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit;
        double amt, total_amt, surcharge;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter consumed units");
        unit = obj.nextInt();
        if (unit <= 50) {
            amt = unit * 0.50;
        } else if (unit < 150) {
            amt = 25 + ((unit - 50) * 0.75);
        } else if (unit < 250) {
            amt = 100 + ((unit - 150) * 1.20);
        } else {
            amt = 220 + ((unit - 250) * 1.50);
        }
        surcharge = amt * 0.20;
        total_amt = amt + surcharge;
        System.out.println("Total Electricity Bill is : " + total_amt);
    }
}
