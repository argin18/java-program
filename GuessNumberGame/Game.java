import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int myNumber = (int) (Math.random() * 100);
        Scanner obj = new Scanner(System.in);
        int userNumber;
        System.out.println("Guess my number in 1-100 :  ");
        int count = 1;
        do {
            userNumber = obj.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Woohoo!!... CORRECT NUMBER ");
                break;
            } else if (userNumber > myNumber) {
                if ((userNumber - myNumber) <= 10) {

                    System.out.println("Your are almost there. Go Down ");
                } else {
                    System.out.println("Your number is too large..");
                }
            } else {
                if ((myNumber - userNumber) <= 10) {

                    System.out.println("Your are almost there. Go Up");
                } else {
                    System.out.println("Your number is too small..");
                }

            }
            // count++;
        } while (true);
        System.out.println("My number was : " + myNumber);
        System.out.println("");
        obj.close();
    }
}
