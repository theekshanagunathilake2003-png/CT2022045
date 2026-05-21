package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();

        Temperature temp = new Temperature();

        temp.setFahrenheit(fahrenheitInput);

        double celsiusResult = temp.toCelsius();

        System.out.println(fahrenheitInput + " Fahrenheit = " + celsiusResult + " Celsius");

        scanner.close();
    }
}
