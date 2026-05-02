package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        double totalInches = cm / 2.54;

        int feet = (int) totalInches / 12;

        int inches = (int) totalInches % 12;

        System.out.println( cm + " cm " + "= " + feet + "feet and " + inches + " inches ");

        scanner.close();
    }

}
