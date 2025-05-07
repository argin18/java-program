package Operators;

public class AreaOfCircumference {

    public static void main(String[] args) {
        double a, c;
        int r = 3;
        a = Math.PI * Math.pow(r, 2);
        c = 2 * Math.PI * r;
        System.out.println("Area of circle is : " + a);
        System.out.println("Circumference of circle is : " + c);
    }
}
