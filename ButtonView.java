import javax.swing.JButton;

public class ButtonView extends JButton implements PlusMinusListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ButtonView(String name) {
        super(name);
    }

    @Override
    public void valueChanged(PlusMinusModel mode) {

    }
}
