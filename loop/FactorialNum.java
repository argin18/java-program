public class FactorialNum {
    public static void main(String[] args) {
        int fact = 1, a = 5;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("The factorial number of " + a + " is: " + fact);
    }
}
