package q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third integer number: ");
        int c = scanner.nextInt();

        int smallest;

        if(a <= b && a <= c){
            smallest = a;
        }else if(b <= a && b <= c){
            smallest = b;
        }else{
            smallest = c;
        }

        System.out.print("The smallest integer number: " + smallest);

        scanner.close();
    }
}
