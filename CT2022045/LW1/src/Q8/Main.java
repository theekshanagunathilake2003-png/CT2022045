package Q8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence with ! in it: ");
        String sentence = sc.nextLine();

        int position = sentence.indexOf("! ");

        String firstPart = sentence.substring(0, position);
        String secondPart = sentence.substring(position + 1);

        System.out.println(firstPart.trim());
        System.out.println(secondPart.trim());

    }

}
