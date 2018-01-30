import javax.swing.JLabel;

public class CounterView extends JLabel implements PlusMinusListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CounterView(PlusMinusModel model) {
        this.valueChanged(model);
    }

    @Override
    public void valueChanged(PlusMinusModel model)
    {
        this.setText(model.getZahlToString());
    }
}
