package Q5;

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

        Dog[] dogs = new Dog[100];
        int dogCount = 0;

        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                dogs[dogCount] = (Dog) pets[i];
                dogCount++;
            }
        }

        if (dogCount > 0) {

            double total = 0;
            double min = dogs[0].getWeight();
            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {
                total += dogs[i].getWeight();
                if (dogs[i].getWeight() < min) {
                    min = dogs[i].getWeight();
                }
                if (dogs[i].getWeight() > max) {
                    max = dogs[i].getWeight();
                }
            }

            double average = total / dogCount;

            System.out.println("\n--- Dog Weight Statistics ---");
            System.out.println("Average Weight: " + average);
            System.out.println("Minimum Weight: " + min);
            System.out.println("Maximum Weight: " + max);

        } else {
            System.out.println("No dogs entered.");
        }
    }
}