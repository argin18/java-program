package Method;

public class Sum {
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        sum(a, b);
    }
}
