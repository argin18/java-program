package Operators;

public class AreaOfTrangle {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        double s, A;
        s = (a + b + c) / 2.0;
        A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The Area of tringle is :" + A);
    }
}
