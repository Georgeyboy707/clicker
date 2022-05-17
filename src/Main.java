import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

       // demo GUI
       System.out.println("SEQUENCE: Program started");
       JFrame frame = new JFrame("Demo frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       GUI myGUI = new GUI(600, 400);
       frame.add(myGUI);
       frame.pack();
       frame.setVisible(true);

/*
        ClickCounter myClickCounter = new ClickCounter();
        final var myClickCounter1 = myClickCounter;
*/
        //Basic myGraph = new Basic(300, 300);
    }
}
