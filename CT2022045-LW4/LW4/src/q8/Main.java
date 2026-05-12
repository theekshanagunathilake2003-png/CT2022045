package q8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + n + ":");
        System.out.println("----------------------------");

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        scanner.close();
    }
}
