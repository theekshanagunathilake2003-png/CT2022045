package q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==== Entree =====");
        System.out.println("1. Tofu Burger    $3.49");
        System.out.println("2. Cajun Chicken  $4.59");
        System.out.println("3. Buffalo Wings  $3.99");
        System.out.println("4. Rainbow Fillet $2.99");
        System.out.print("Select your entree (1-4): ");
        int entreeChoice = scanner.nextInt();

        String entreeName = "";
        double entreePrice = 0.0;

        switch (entreeChoice){
            case 1:
                entreeName = "Tofu Burger";
                entreePrice = 3.49;
                break;
            case 2:
                entreeName = "Cajun Chicken";
                entreePrice = 4.59;
                break;
            case 3:
                entreeName = "Buffalo Wings";
                entreePrice = 3.99;
                break;
            case 4:
                entreeName = "Rainbow Fillet";
                entreePrice = 2.99;
                break;
            default:
                System.out.println("Invalid entree selection.");
        }

        System.out.println("\n==== Side Dish =====");
        System.out.println("1. Rice Cracker   $0.79");
        System.out.println("2. No-Salt Fries  $0.69");
        System.out.println("3. Zucchini       $1.09");
        System.out.println("4. Brown Rice     $0.59");
        System.out.print("Select your side dish (1-4): ");
        int sideChoice = scanner.nextInt();

        String sideName = "";
        double sidePrice = 0.0;

        switch (sideChoice){
            case 1:
                sideName = "Rice Cracker";
                sidePrice = 0.79;
                break;
            case 2:
                sideName = "No-Salt Fries";
                sidePrice = 0.69;
                break;
            case 3:
                sideName = "Zucchini";
                sidePrice = 1.09;
                break;
            case 4:
                sideName = "Brown Rice";
                sidePrice = 0.59;
                break;
            default:
                System.out.println("Invalid side dish selection.");
        }

        System.out.println("\n==== Drink =====");
        System.out.println("1. Cafe Mocha  $1.99");
        System.out.println("2. Cafe Latte  $1.90");
        System.out.println("3. Espresso    $2.49");
        System.out.println("4. Oolong Tea  $0.99");
        System.out.print("Select your drink (1-4): ");
        int drinkChoice = scanner.nextInt();

        String drinkName = "";
        double drinkPrice = 0.0;

        switch (drinkChoice){
            case 1:
                drinkName = "Cafe Mocha";
                drinkPrice = 1.99;
                break;
            case 2:
                drinkName = "Cafe Latte";
                drinkPrice = 1.90;
                break;
            case 3:
                drinkName = "Espresso";
                drinkPrice = 2.49;
                break;
            case 4:
                drinkName = "Oolong Tea";
                drinkPrice = 0.99;
                break;
            default:
                System.out.println("Invalid drink selection.");
        }

        double totalPrice = entreePrice + sidePrice + drinkPrice;

        System.out.println("\n==== YOUR ORDER ====");
        System.out.printf("Entree    : %-15s $%.2f%n", entreeName, entreePrice);
        System.out.printf("Side Dish : %-15s $%.2f%n", sideName, sidePrice);
        System.out.printf("Drink     : %-15s $%.2f%n", drinkName, drinkPrice);
        System.out.println("-----------------------");
        System.out.printf("Total                      $%.2f%n", totalPrice);

        scanner.close();
    }
}
