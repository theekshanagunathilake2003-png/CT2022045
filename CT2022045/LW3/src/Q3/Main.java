package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        System.out.print("Enter the radius od the inner circle (ri): ");
        double ri = scanner.nextDouble();

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);

        double outerArea = outerCircle.computeArea();
        double innerArea = innerCircle.computeArea();

        double shadedArea = outerArea - innerArea;

        double outerCircumference = outerCircle.computeCircumference();
        double innerCircumference = innerCircle.computeCircumference();

        System.out.println("\n---Results---");
        System.out.println("Outer Circle Area       : " + outerArea);
        System.out.println("Inner Circle Area       : " + innerArea);
        System.out.println("Shaded Region Area      : " + shadedArea);
        System.out.println("Outer Circumference     : " + outerCircumference);
        System.out.println("Outer Circumference     : " + innerCircumference);

        scanner.close();
    }
}
