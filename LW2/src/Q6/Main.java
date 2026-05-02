package Q6;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();

        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

        scanner.close();

    }

}
