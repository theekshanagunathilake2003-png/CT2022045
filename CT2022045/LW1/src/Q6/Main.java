package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title: ");
        String title = sc.nextLine();

        System.out.print("Enter width: ");
        int w = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(w, h);
        frame.setVisible(true);

    }

}

