import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener {
    // canvas for other GUI widgets
    public long[] msOfClickLong = new long[100];
    public int[] msOfClick = new int[100];
    public int[] msBetweenClicks = new int[100];
    public int count = 0;


    JButton button1;
    JButton button2;

    public GUI(int width, int height) {

        System.out.println("SQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Basic Graph");
        button1.setBounds(0,0, 200, 40);
        button2 = new JButton("b2");
        button2.setBounds(240,0, 100, 40);

        button1.addActionListener(this);
        add(button1);
        add(button2);

        /*
        for (int i = 0; i<100; i++){

            msBetweenClicks[i] = (int) (msOfClick[i+1] - msOfClick[i]);
            System.out.println(msBetweenClicks);
        }
*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click!  "+e.getActionCommand());
        Basic myGraph = new Basic(300, 300);


        //msOfClickLong[count] = e.getWhen();
        //msOfClick[count] = (int) msOfClickLong[count];

    }
}
