package Q1;

public class Main {

    public static void main(String[] args){

        Dog dog1 = new Dog();
        dog1.setName("Rocky");

        Cat cat1 = new Cat();
        cat1.setName("Chandi");

        System.out.println(dog1.getName() + " " + dog1.speak());
        System.out.println(cat1.getName() + " " + cat1.speak());
    }

}
