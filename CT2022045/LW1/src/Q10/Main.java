package Q10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = sc.nextLine();

        int length = word.length();
        int middlePosition = length / 2;

        char middleChar = word.charAt(middlePosition);

        System.out.println(middleChar);
    }
}
