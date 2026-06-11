package Q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100];
        Cat[] cats = new Cat[100];
        Dog[] dogs = new Dog[100];
        int count = 0;
        int catCount = 0;
        int dogCount = 0;

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
                dogs[dogCount] = dog;
                count++;
                dogCount++;
            } else if (type == 'c') {
                System.out.print("Enter cat coat color: ");
                String coatColor = scanner.nextLine();
                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(coatColor);
                pets[count] = cat;
                cats[catCount] = cat;
                count++;
                catCount++;
            }
        }

        while (true) {

            System.out.println("\n1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                break;

            } else if (choice == 1) {
                System.out.print("Enter cat name: ");
                String name = scanner.nextLine();
                System.out.print("Enter cat coat color: ");
                String coatColor = scanner.nextLine();
                Cat cat = new Cat();
                cat.setName(name);
                cat.setCoatColor(coatColor);
                pets[count] = cat;
                cats[catCount] = cat;
                count++;
                catCount++;
                System.out.println("Cat added.");

            } else if (choice == 2) {
                System.out.print("Enter dog name: ");
                String name = scanner.nextLine();
                System.out.print("Enter dog weight: ");
                double weight = Double.parseDouble(scanner.nextLine());
                Dog dog = new Dog();
                dog.setName(name);
                dog.setWeight(weight);
                pets[count] = dog;
                dogs[dogCount] = dog;
                count++;
                dogCount++;
                System.out.println("Dog added.");

            } else if (choice == 3) {
                System.out.print("Enter cat name to remove: ");
                String name = scanner.nextLine();

                for (int i = 0; i < count; i++) {
                    if (pets[i].getName().equals(name)) {
                        for (int j = i; j < count - 1; j++) {
                            pets[j] = pets[j + 1];
                        }
                        pets[count - 1] = null;
                        count--;
                        break;
                    }
                }

                for (int i = 0; i < catCount; i++) {
                    if (cats[i].getName().equals(name)) {
                        for (int j = i; j < catCount - 1; j++) {
                            cats[j] = cats[j + 1];
                        }
                        cats[catCount - 1] = null;
                        catCount--;
                        break;
                    }
                }
                System.out.println("Cat removed.");

            } else if (choice == 4) {
                System.out.print("Enter dog name to remove: ");
                String name = scanner.nextLine();

                for (int i = 0; i < count; i++) {
                    if (pets[i].getName().equals(name)) {
                        for (int j = i; j < count - 1; j++) {
                            pets[j] = pets[j + 1];
                        }
                        pets[count - 1] = null;
                        count--;
                        break;
                    }
                }

                for (int i = 0; i < dogCount; i++) {
                    if (dogs[i].getName().equals(name)) {
                        for (int j = i; j < dogCount - 1; j++) {
                            dogs[j] = dogs[j + 1];
                        }
                        dogs[dogCount - 1] = null;
                        dogCount--;
                        break;
                    }
                }
                System.out.println("Dog removed.");
            }
        }

        System.out.println("\n--- Cat List ---");
        for (int i = 0; i < catCount; i++) {
            System.out.println("Name: " + cats[i].getName() + " | Type: Cat | Coat Color: " + cats[i].getCoatColor());
        }

        System.out.println("\n--- Dog List ---");
        for (int i = 0; i < dogCount; i++) {
            System.out.println("Name: " + dogs[i].getName() + " | Type: Dog | Weight: " + dogs[i].getWeight());
        }
    }
}