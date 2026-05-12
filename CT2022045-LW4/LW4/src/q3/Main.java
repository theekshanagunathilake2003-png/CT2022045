package q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a power: ");
        int power = scanner.nextInt();

        switch (power) {
            case 6:
                System.out.println( power + " -> Million");
                break;
            case 9:
                System.out.println( power + " -> Billion");
                break;
            case 12:
                System.out.println( power + " -> Trillion");
                break;
            case 15:
                System.out.println( power + " -> Quadrillion");
                break;
            case 18:
                System.out.println( power + " -> Quintillion");
                break;
            case 21:
                System.out.println( power + " -> Sextillion");
                break;
            case 30:
                System.out.println( power + " -> Nonillion");
                break;
            case 100:
                System.out.println( power + " -> Googol");
                break;
            default:
                System.out.println( power + " -> Has no corresponding word in our table.");
                break;
        }
        scanner.close();
    }
}
