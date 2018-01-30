import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class JUnit extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public JUnit() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(100, 150);
        setLocation(150, 150);
        ButtonView plusbtn = new ButtonView("+");
        ButtonView minusbtn = new ButtonView("-");

        CounterView ctnlbl = new CounterView();
        this.add(plusbtn);
        this.add(ctnlbl);
        this.add(minusbtn);

        this.setVisible(true);


    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new JUnit();
    }

}
