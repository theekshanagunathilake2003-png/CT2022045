package Q9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double p = scanner.nextDouble();

        System.out.print("Enter the annual interest rate in percent (R): ");
        double r = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int n = scanner.nextInt();

        double amount = p * Math.pow((1 + (r / 100.0)), n);

        double earned = amount - p;

        System.out.printf("Total amount earned after %d years: %.2f%n", n, amount);
        System.out.printf("Amount earned: %.2f%n", earned);

        scanner.close();

    }

}
