package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        int count = 0;

        while(true){

            System.out.print("Enter pet name (STOP to quit): ");
            String name = scanner.nextLine();

            if (name.equals("STOP")){
                break;
            }

            System.out.print("Enter pet type (d for dog, c for cat): ");
            char type = scanner.nextLine().charAt(0);

            if (type == 'd'){
                Dog dog = new Dog();
                dog.setName(name);
                pets[count] = dog;
            }else{
                Cat cat = new Cat();
                cat.setName(name);
                pets[count] = cat;
            }

            count++;
        }

        System.out.println("\n--- Pet List ---\n");

        for (int i = 0; i < count; i++) {

            if(pets[i] instanceof Dog){
                System.out.println("Name: " + pets[i].getName() + " | Type: Dog");
            }else{
                System.out.println("Name: " + pets[i].getName() + " | Type: Cat");
            }
        }

    }
}
