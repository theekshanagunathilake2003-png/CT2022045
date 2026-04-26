package Q11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = sc.nextLine();

        String[] parts = fullName.split(" ");

        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        char middleInitial = middleName.charAt(0);

        System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");

    }
}
