package ConditionalStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char op;
        double first, second;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an operator(+,-,/,*,%)");
        op = obj.next().charAt(0);
        System.out.println("Enter two oparands :");
        first = obj.nextDouble();
        second = obj.nextDouble();
        switch (op) {
            case '+':
                System.out.println("The result is : " + (first + second));
                break;
            case '-':
                System.out.println("The result is : " + (first - second));
                break;
            case '*':
                System.out.println("The result is : " + (first * second));
                break;
            case '/':
                if (second != 0) {
                    System.out.println("The result is : " + (first / second));
                } else {
                    System.out.println("Can't divide by Zero!!");
                }
                break;
            case '%':
                if (second != 0) {
                    System.out.println("The result is : " + (first % second));
                } else {
                    System.out.println("Can't divide by Zero!!");
                }
                break;

            default:
                System.out.println("You entered Invalid operator, please cheak");
                obj.close();
                return;
        }
    }
}
