package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);

        scanner.close();

    }

}