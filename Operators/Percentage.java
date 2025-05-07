package Operators;

public class Percentage {
    public static void main(String[] args) {
        int eng = 60, math = 78, java = 68, dsa = 90;
        double om, total = 400;
        double Percent;
        om = eng + math + java + dsa;
        Percent = (om / total) * 100;
        System.out.println("Percentage of student is : " + Percent + "%");
    }
}
