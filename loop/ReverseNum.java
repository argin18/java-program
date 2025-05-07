import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any number: ");
        String numStr = obj.nextLine();

        String reversed = new StringBuilder(numStr).reverse().toString();

        System.out.println("Reverse number is: " + reversed);
    }
}