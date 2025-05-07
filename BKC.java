import java.io.BufferedReader;
import java.util.Scanner;

public class BKC {
    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {
            System.out.println("Welcome to, Birat Kshitiz College.");
            System.out.println("What is your query?");
            System.out.println("1. Available Courses");
            System.out.println("2. Contact Details");
            System.out.println("3. Book Seat Now");
            System.out.println("=====================================");

            Scanner scanner = new Scanner(System.in);
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter query number: ");
            int userResponse = scanner.nextInt();
            System.out.println("=====================================");
            switch (userResponse) {
                case 1:
                    System.out.println("Courses we offering:");
                    showCourses();
                    System.out.println("=====================================");
                    break;
                case 2:
                    System.out.println("Contact us:");
                    showContact();
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("Enter your details: ");
                    System.out.print("Enter your name: ");
                    String k = ob.nextLine();

                    System.out.print("Enter Course name: ");
                    String course = ob.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phnNum = new Scanner(System.in).nextLine();
                    System.out.println("=====================================");
                    break;
                default:
                    System.out.println("Invalid query.");
                    System.out.println("=====================================");
                    System.out.println("  ");
                    break;
            }
            System.out.println("Do you want to continue?(Y/N)");
            String ans = new Scanner(System.in).nextLine();
            if (ans.equalsIgnoreCase("n")) {
                condition = false;
            } else if (!ans.equalsIgnoreCase("y")) {
                condition = true;
            }
        }
    }

    static void showCourses() {
        Course bca = new Course(1, "BCA", "4-years", 500000);
        Course csit = new Course(2, "BSc. CSIT", "4-years", 550000);
        Course bit = new Course(3, "BIT", "4-years", 450000);
        bca.displayCourse();
        System.out.println(" ");
        csit.displayCourse();
        System.out.println(" ");
        bit.displayCourse();
    }

    static void showContact() {
        System.out.println("""
                Birat Kshitiz College
                Biratnagar-03, Morang
                +977-9801234567
                """);
    }
}