package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Temperature temp = new Temperature(celsiusInput);

        double fahrenheitResult = temp.toFahrenheit();

        System.out.println(celsiusInput + " Celsius = " + fahrenheitResult + " Fahrenheit");

        scanner.close();
    }
}
