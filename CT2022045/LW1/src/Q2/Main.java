package Q2;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        JFrame frame = new JFrame();
        frame.setTitle(firstName + " " + lastName);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }

}
