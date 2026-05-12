package q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String clean = input.toLowerCase();
        clean = clean.replace(" ", "");

        String reversed = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reversed = reversed + clean.charAt(i);
        }

        if (clean.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome!");
        } else {
            System.out.println("\"" + input + "\" is Not a Palindrome.");
        }

        scanner.close();
    }
}
