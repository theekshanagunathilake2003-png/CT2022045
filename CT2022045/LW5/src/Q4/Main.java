package Q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {

            System.out.print("Enter pet name (STOP to quit): ");
            String name = scanner.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            System.out.print("Enter pet type (d for dog, c for cat): ");
            char type = scanner.nextLine().charAt(0);

            if (type == 'd') {
                System.out.print("Enter dog weight: ");
                double weight = Double.parseDouble(scanner.nextLine());
                Dog dog = new Dog();
                dog.setName(name);
                dog.setWeight(weight);
                pets[count] = dog;
            } else if (type == 'c') {
                System.out.print("Enter cat coat color: ");
                String coatColor = scanner.nextLine();
                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(coatColor);
                pets[count] = cat;
            }

            count++;
        }

        System.out.println("\n--- Cat List ---");

        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                Cat cat = (Cat) pets[i];
                System.out.println("Name: " + cat.getName() + " | Type: Cat | Coat Color: " + cat.getCoatColor());
            }
        }

        System.out.println("\n--- Dog List ---");

        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                Dog dog = (Dog) pets[i];
                System.out.println("Name: " + dog.getName() + " | Type: Dog | Weight: " + dog.getWeight());
            }
        }
    }
}