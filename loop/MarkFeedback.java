import java.util.Scanner;

public class MarkFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to input marks or 0 to exit:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please enter 1 to continue or 0 to exit.");
            }
            System.out.println("");
        } while (choice != 0);

        System.out.println("Program exited.");
        sc.close();
    }
}
