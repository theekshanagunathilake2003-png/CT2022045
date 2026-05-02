package Q8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;

        double V = (4.0/3.0) * (pi * (Math.pow(radius, 3)));

        System.out.printf("The volume of the sphere is: %.2f%n", V);

        scanner.close();

    }

}
