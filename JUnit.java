import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class JUnit extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public JUnit(PlusMinusModel model, String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(100, 150);
        setLocation(150, 150);
        ButtonView plusbtn = new ButtonView("+", model);
        ButtonView minusbtn = new ButtonView("-",model);
        CounterView ctnlbl = new CounterView(model);

        model.addListener(plusbtn);
        model.addListener(minusbtn);
        model.addListener(ctnlbl);

        PlusController pc = new PlusController(model);
        MinusController mc = new MinusController(model);

        plusbtn.addActionListener(pc);
        minusbtn.addActionListener(mc);
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

        int min = 0;
        int max = 20;

        PlusMinusModel model = new PlusMinusModel(min,max);
        new JUnit(model, "PlusMinus");
        new JUnit(model, "PlusMinus 2");
    }

}
