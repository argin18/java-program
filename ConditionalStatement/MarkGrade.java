package ConditionalStatement;

public class MarkGrade {
    public static void main(String[] args) {
        int eng = 60, math = 78, java = 68, dsa = 90;
        double om, total = 400;
        double Percent;
        om = eng + math + java + dsa;
        Percent = (om / total) * 100;
        if (Percent >= 80 && Percent <= 100) {
            System.out.println("Grade is : A");
        } else if (Percent >= 75 && Percent < 80) {
            System.out.println("Grade is : A-");
        } else if (Percent >= 70 && Percent < 75) {
            System.out.println("Grade is : B+");
        } else if (Percent >= 65 && Percent < 70) {
            System.out.println("Grade is : B");
        } else if (Percent >= 60 && Percent < 65) {
            System.out.println("Grade is : B-");
        } else if (Percent >= 55 && Percent < 60) {
            System.out.println("Grade is : C+");
        } else if (Percent >= 50 && Percent < 55) {
            System.out.println("Grade is : C");
        } else if (Percent >= 45 && Percent < 50) {
            System.out.println("Grade is : C-");
        } else if (Percent >= 40 && Percent < 45) {
            System.out.println("Grade is : D");
        } else {
            System.out.printf("You are Fail.");
        }
    }
}
