package ConditionalStatement;

import java.util.Scanner;

public class VowelAndCons {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any word or sentence : ");
        String input = obj.nextLine();
        obj.close();

        int vowels = 0, consonants = 0;
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
