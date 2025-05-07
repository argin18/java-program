import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.println("Welcome to, Birat Kshitiz College.");
            System.out.println("What is your query?");
            System.out.println("1. Available Courses");
            System.out.println("2. Contact Details");
            System.out.println("3. Book Seat Now");
            System.out.println("=====================================");

            System.out.print("Enter query number: ");
            int userResponse = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
            System.out.println("=====================================");

            switch (userResponse) {
                case 1 -> {
                    System.out.println("Courses we are offering:");

                    System.out.println("=====================================");
                }
                case 2 -> {
                    System.out.println("Contact us:");

                    System.out.println("=====================================");
                }
                case 3 -> {
                    System.out.println("Enter your details: ");
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Course name: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter your phone number: ");
                    String phnNum = scanner.nextLine();

                    System.out.println("Booking Successful for " + name + " in " + course + " course.");
                    System.out.println("=====================================");
                }
                default -> {
                    System.out.println("Invalid query.");
                    System.out.println("=====================================");
                }
            }

            System.out.println("Do you want to continue? (Y/N)");
            String ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("n")) {
                condition = false;
            }
        }

        scanner.close();
    }

}
