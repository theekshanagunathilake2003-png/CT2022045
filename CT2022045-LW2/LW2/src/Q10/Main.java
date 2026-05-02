package Q10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final int MONTHS_IN_YEAR = 12;

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interset rate (in percent): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan period (in years): ");
        int loanPeriod = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1.0 - Math.pow(1.0 / (1.0 + monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("Monthly payment: %.2f%n", monthlyPayment);
        System.out.printf("Total payment: %.2f%n", totalPayment);

    }

}
