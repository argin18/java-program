package ConditionalStatement;

public class SmallestNum {
    public static void main(String[] args) {
        int a = 10, b = 37, c = 9;
        if (a > c && c > b) {
            System.out.println("Smallest number is : " + b);
        } else if (b > a && a > c) {
            System.out.println("Smallest number is : " + c);
        } else {
            System.out.println("Smallest number is : " + a);
        }
    }
}
