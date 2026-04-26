package Q9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int length = text.length();

        char firstChar = text.charAt(0);
        char lastChar = text.charAt(length - 1);

        System.out.println(length);
        System.out.println(firstChar);
        System.out.println(lastChar);

    }
}
