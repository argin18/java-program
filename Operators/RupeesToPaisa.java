package Operators;

public class RupeesToPaisa {
    public static void main(String[] args) {
        int paisa = 1250;
        int rupee, remainingpaisa;
        rupee = paisa / 100;
        remainingpaisa = paisa % 100;
        System.out.println("The cost of pen is :" + rupee + " Rupees and " + remainingpaisa + " paisa");
    }

}
