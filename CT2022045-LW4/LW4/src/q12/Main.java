package q12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        String result = sentence.replace(oldWord, newWord);

        System.out.println("\nOriginal  : " + sentence);
        System.out.println("Updated   : " + result);

        scanner.close();
    }
}
