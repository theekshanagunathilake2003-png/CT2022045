package Q7;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args){

        LocalTime now = LocalTime.now();

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("hh:mm:ss a" );

        String formattedTime = now.format(formatter);

        JFrame frame = new JFrame();
        frame.setTitle(formattedTime);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }

}
