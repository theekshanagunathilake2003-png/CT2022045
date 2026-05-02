package Q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();

        double Celsius = (5.0/9.0) *  (Fahrenheit - 32);

        System.out.printf("Temperature in Celsius: %.2f%n", Celsius);

        scanner.close();
    }

}
