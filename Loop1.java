public class Loop1 {
    public static void main(String[] args) {
        int a = 20;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}