package q7;

import java.util.Scanner;

public class Main {

    static int countDigits(int number) {

        if (number == 0) {
            return 1;
        }

        if (number < 0) {
            number = -number;
        }

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (negative to stop): ");
        int input = scanner.nextInt();

        while (input >= 0) {
            int digits = countDigits(input);
            System.out.println(input + " has " + digits + " digit(s)");

            System.out.print("Enter a number (negative to stop): ");
            input = scanner.nextInt();
        }

        System.out.println("Program stopped.");
        scanner.close();
    }
}
