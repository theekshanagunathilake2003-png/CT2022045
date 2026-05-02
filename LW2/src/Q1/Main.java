package Q1;

public class Main {

    public static void main(String[] args){

        double A = 2.0;
        double B = 5.0;
        double C = 3.0;
        double X = 8.0;
        double Y = 2.0;
        double r = 7.0;

        double resultA = Math.sqrt((B * B) + (4 * A * C));
        System.out.println("a. sqrt(B^2 + 4AC) = " + resultA);

        double resultB = Math.sqrt( X + (4 * Math.pow(Y, 3)));
        System.out.println("b. sqrt(X + 4 * Y^3) = " + resultB);

        double resultC = Math.cbrt(X * Y);
        System.out.println("c. Cube root of (X * Y) = " + resultC);

        double resultD = Math.PI * Math.pow(r, 2);
        System.out.println("d. Area of circle = " + resultD);

    }

}

