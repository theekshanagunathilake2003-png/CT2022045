package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        char middleInitial = middleName.charAt(0);

        System.out.println(firstName + " " + middleInitial + ". " + lastName);

    }

}

