package Q4;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle();

        System.out.println("--- Bicycle 1 (Default Owner) ---");
        System.out.println("Owner Name : " + bicycle1.getOwner().getOwnerName());
        System.out.println("Phone No   : " + bicycle1.getOwner().getPhoneNo());

        Owner owner2 = new Owner("Alice", "0771234567");

        Bicycle bicycle2 = new Bicycle(owner2);

        System.out.println("\n--- Bicycle 2 (With Owner) ---");
        System.out.println("Owner Name : " + bicycle2.getOwner().getOwnerName());
        System.out.println("Phone No   : " + bicycle2.getOwner().getPhoneNo());

        Owner owner3 = new Owner("Bob", "0789876543");
        bicycle2.setOwner(owner3);

        System.out.println("\n--- Bicycle 2 (After Owner Change) ---");
        System.out.println("Owner Name : " + bicycle2.getOwner().getOwnerName());
        System.out.println("Phone No   : " + bicycle2.getOwner().getPhoneNo());

    }

}